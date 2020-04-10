package One.text;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import One.entity.Student;

public class JDBCInsert {
	public static void main(String[] args) {
		Student stu = new Student(0, "王五", 20, "打篮球", "孩子");

		Connection conn = null;
		Statement st = null;
		try {
			// 加载驱动
			Class.forName("com.mysql.jdbc.Driver");

			// 链接数据库
			conn = DriverManager.getConnection(
					"jdbc:mysql:///studytest?user=root&password=root&serverTimezone=UTC&characterEncoding=utf-8");

			st = conn.createStatement();
			String sql = "insert into student (sname,age,hobby,shows) values ('" + stu.getSname() + "'," + stu.getAge()
					+ ",'" + stu.getHobby() + "','" + stu.getShows() + "')";
			System.out.println(sql);
			int insert = st.executeUpdate(sql);

			if (insert > 0) {
				System.out.println(insert);
				System.out.println("成功");
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
