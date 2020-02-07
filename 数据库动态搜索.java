package 数据库;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class 数据库动态搜索 {
	public static void main(String[] args) {
		Connection con = null;
		try {
			//添加数据库驱动
			Class.forName("com.mysql.jdbc.Driver");
			//连接数据库
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test","root","root");
			
			//动态规划  可以避免数据库安全漏洞，使用？通配符进行改善
			String sql = "select * from tb_stu where name = ? or sex = ?";
			//PreparedStatement继承于statement，更加安全，强大
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, "%");
			ps.setString(2, "男");
			
			ResultSet rs = ps.executeQuery();
			System.out.println("id\tname\tsex\tbirthday");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t"+rs.getInt(2)+"\t"+rs.getInt(3)+"\t"+rs.getInt(4));
			}
			rs.close();
			ps.close();
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
