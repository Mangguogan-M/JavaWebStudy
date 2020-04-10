package Two.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Two.entity.User;
import Two.utils.JDBCUtil;

public class JDBCUtilDemo {
	public static void main(String[] args) throws SQLException {
		Connection conn = JDBCUtil.getConnection();
		PreparedStatement ps = conn.prepareStatement("select * from user");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			int uid = rs.getInt("uid");
			String username = rs.getString("username");
			String password = rs.getString("password");

			User user = new User(uid, username, password);
			System.out.println(user);
		}
		JDBCUtil.close(conn, ps, rs);
	}
}
