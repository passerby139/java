package 数据库;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

public class 数据库搜索 {
	public static void main(String[] args) {
		Connection con = null;//连接接口
		Statement stmt = null;//发送sql接口
		ResultSet rs = null;//结果集接口
		try {
			//添加驱动
			Class.forName("com.mysql.jdbc.Driver");
			//连接数据库
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test","root","root");
			//创建对象
		    stmt = con.createStatement();
		    //发送sql语句并回送结果
		    rs = stmt.executeQuery("select * from tb_st");
		    //遍历寻找
		    while(rs.next()) {
		    	int id = rs.getInt("id");
		    	String name = rs.getString(2);
		    	String sex = rs.getString("sex");
		    	String birthday = rs.getString(4);
		    	System.out.println("编号="+id+"姓名="+name+"性别="+sex+"生日="+birthday);
		    }
		} catch (ClassNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally {
			//依次关闭
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}
}
