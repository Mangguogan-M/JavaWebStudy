package Two.batch;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Two.utils.JDBCUtil;

public class BatchDelete {

	public static void main(String[] args) {
		String id = "3,5,7";

		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = JDBCUtil.getConnection();
			ps = conn.prepareStatement("delete from user where uid in(" + id + ")");
			int update = ps.executeUpdate();

			if (update > 0) {
				System.out.println("成功！");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			JDBCUtil.close(conn, ps, null);

		}

	}

}
