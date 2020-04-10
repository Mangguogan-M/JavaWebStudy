package One.text;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDelete {
	public static void main(String[] args) {
		int id = 1;
		Connection conn = null;
		Statement st = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/studytest?serverTimezone=UTC&characterEncoding=utf-8", "root", "root");

			st = conn.createStatement();

			int delete = st.executeUpdate("delete from student where sid=" + id);

			if (delete > 0) {
				System.out.println("成功");
			}else {
				System.out.println("好像没有成功呢！");
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

		}

	}
}
