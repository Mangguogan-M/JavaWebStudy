package Two.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDemo {
	public static void main(String[] args) {
		String username = "1' or 1='1";
		String password = "1' or 1='1";

		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/studytest?serverTimezone=UTC&characterEncoding=utf-8", "root", "root");

			st = conn.createStatement();

			rs = st.executeQuery("select * from user where username='" + username + "' and password ='" + password + "'");
			if (rs.next()) {
				System.out.println("登录成功");
			} else {
				System.out.println("登录失败");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
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
