package ���ݿ�;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

public class ���ݿ����� {
	public static void main(String[] args) {
		Connection con = null;//���ӽӿ�
		Statement stmt = null;//����sql�ӿ�
		ResultSet rs = null;//������ӿ�
		try {
			//�������
			Class.forName("com.mysql.jdbc.Driver");
			//�������ݿ�
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test","root","root");
			//��������
		    stmt = con.createStatement();
		    //����sql��䲢���ͽ��
		    rs = stmt.executeQuery("select * from tb_st");
		    //����Ѱ��
		    while(rs.next()) {
		    	int id = rs.getInt("id");
		    	String name = rs.getString(2);
		    	String sex = rs.getString("sex");
		    	String birthday = rs.getString(4);
		    	System.out.println("���="+id+"����="+name+"�Ա�="+sex+"����="+birthday);
		    }
		} catch (ClassNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}finally {
			//���ιر�
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
	}
}
