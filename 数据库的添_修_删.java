package 数据库;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class 数据库的添_修_删 {
	public static void main(String[] args) {
		Connection con = null;
		Statement sate = null;
		try {
			//添加数据库驱动
			Class.forName("com.mysql.jdbc.Driver");
			//连接数据库
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test","root","root");
			
			sate = con.createStatement();
			
			//插入数据
			String sql1 = "insert into tb_stu(name,sex,birthday) values('tom','男','2012-02-01')";
			int result1 = sate.executeUpdate(sql1);
			System.out.println("有"+result1+"行数据被修改");
			
			//修改数据
			String sql2 = "update into tb_stu set birthday = '1970-01-01' where id = 5";
			int result2 = sate.executeUpdate(sql2);
			System.out.println("有"+result2+"行数据被修改");
			
			//删除数据
			String sql3 = "delete from tb_stu where id = 5";
			int result3 = sate.executeUpdate(sql3);
			System.out.println("有"+result3+"行数据被修改");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally {
			try {
				sate.close();
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
































