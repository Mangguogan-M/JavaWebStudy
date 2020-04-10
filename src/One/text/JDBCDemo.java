package One.text;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {
	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			// 1、加载驱动
			Class.forName("com.mysql.cj.jdbc.Driver");
			// jdbc.url=jdbc:mysql://localhost:3306/studytest?serverTimezone=UTC&characterEncoding=utf-8
			conn = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/studytest?serverTimezone=UTC&characterEncoding=utf-8", "root", "root");
			System.out.println(conn);
			st = conn.createStatement();
			String sql = "select * from student";
			rs = st.executeQuery(sql);
			while (rs.next()) {
				// Object sid = rs.getObject(1);
				// Object sname = rs.getObject(2);
				// Object age = rs.getObject(3);
				// Object hobby = rs.getObject(4);
				// Object shows = rs.getObject(5);
				int sid = rs.getInt("sid");
				int age = rs.getInt("age");
				String sname = rs.getString("sname");
				String hobby = rs.getString("hobby");
				String shows = rs.getString("shows");
				System.out.println(sid + " " + sname + " " + age + "  " + hobby + "   " + shows);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			if (st != null) {
				try {
					st.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
