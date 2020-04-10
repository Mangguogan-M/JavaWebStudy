package Three.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Three.entity.User;
import Three.utils.JDBCUtil;

public class UserDaoImpl implements UserDao {

	public boolean add(User user) {
		return false;
	}

	public boolean del(int id) {
		return false;
	}

	public List<User> findAll() {
		try {
			Connection conn = JDBCUtil.getConnection();
			PreparedStatement ps = conn.prepareStatement("select * from user");
			ResultSet rs = ps.executeQuery();

			List<User> list = new ArrayList<User>();
			while (rs.next()) {
				int uid = rs.getInt("uid");
				String username = rs.getString("username");
				String password = rs.getString("password");

				User user = new User(uid, username, password);
				list.add(user);
			}

			return list;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

}
