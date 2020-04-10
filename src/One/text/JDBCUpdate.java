package One.text;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import One.entity.Student;

public class JDBCUpdate {

	public static void main(String[] args) {

		Connection conn = null;
		Statement st = null;
		Student stu = new Student(2, "王麻子", 45, "女", "老汉");
		try {
			Class.forName("com.mysql.jdbc.Driver");

			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/studytest?serverTimezone=UTC&characterEncoding=utf-8", "root", "root");

			st = conn.createStatement();

			int update = st.executeUpdate("update student set sname='" + stu.getSname() + "',age=" + stu.getAge()
					+ ",hobby='" + stu.getHobby() + "',shows='" + stu.getShows() + "' where sid=" + stu.getSid());
			if (update > 0) {
				System.out.println("成功");
			} else {
				System.out.println("没有成功呢！！");
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
