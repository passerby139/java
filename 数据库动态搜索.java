package ���ݿ�;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ���ݿ⶯̬���� {
	public static void main(String[] args) {
		Connection con = null;
		try {
			//������ݿ�����
			Class.forName("com.mysql.jdbc.Driver");
			//�������ݿ�
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test","root","root");
			
			//��̬�滮  ���Ա������ݿⰲȫ©����ʹ�ã�ͨ������и���
			String sql = "select * from tb_stu where name = ? or sex = ?";
			//PreparedStatement�̳���statement�����Ӱ�ȫ��ǿ��
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, "%");
			ps.setString(2, "��");
			
			ResultSet rs = ps.executeQuery();
			System.out.println("id\tname\tsex\tbirthday");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t"+rs.getInt(2)+"\t"+rs.getInt(3)+"\t"+rs.getInt(4));
			}
			rs.close();
			ps.close();
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
}
