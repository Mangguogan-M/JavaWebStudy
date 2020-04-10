package Six.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Six.entity.User;
import Six.utils.JDBCUtil;

public class UserDaoImpl implements UserDao {

	@Override
	public User login(User user) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			conn = JDBCUtil.getConnection();
			ps = conn.prepareStatement("select * from user where username = ? and password = ?");

			ps.setString(1, user.getUsername());

			ps.setString(2, user.getPassword());

			rs = ps.executeQuery();
			if (rs.next()) {
				User u = new User(rs.getInt("uid"), rs.getString("username"), rs.getString("password"));

				return u;

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, ps, rs);
		}

		return null;
	}

}
