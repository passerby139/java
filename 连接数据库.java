package ���ݿ�;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class �������ݿ� {
	public static void main(String[] args) {
		try {
			//����������
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://127.0.0.1:3306/test";
			String username = "root";
			String password = "root";
			//��ȡ���ݿ����Ӷ���
			Connection con = DriverManager.getConnection(url,username,password);
			System.out.println(con);
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
