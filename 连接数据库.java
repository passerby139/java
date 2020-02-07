package 数据库;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class 连接数据库 {
	public static void main(String[] args) {
		try {
			//加载驱动包
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://127.0.0.1:3306/test";
			String username = "root";
			String password = "root";
			//获取数据库连接对象
			Connection con = DriverManager.getConnection(url,username,password);
			System.out.println(con);
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
}
