package ���ݿ�;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ���ݿ����_��_ɾ {
	public static void main(String[] args) {
		Connection con = null;
		Statement sate = null;
		try {
			//������ݿ�����
			Class.forName("com.mysql.jdbc.Driver");
			//�������ݿ�
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test","root","root");
			
			sate = con.createStatement();
			
			//��������
			String sql1 = "insert into tb_stu(name,sex,birthday) values('tom','��','2012-02-01')";
			int result1 = sate.executeUpdate(sql1);
			System.out.println("��"+result1+"�����ݱ��޸�");
			
			//�޸�����
			String sql2 = "update into tb_stu set birthday = '1970-01-01' where id = 5";
			int result2 = sate.executeUpdate(sql2);
			System.out.println("��"+result2+"�����ݱ��޸�");
			
			//ɾ������
			String sql3 = "delete from tb_stu where id = 5";
			int result3 = sate.executeUpdate(sql3);
			System.out.println("��"+result3+"�����ݱ��޸�");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}finally {
			try {
				sate.close();
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
































