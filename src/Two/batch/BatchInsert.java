package Two.batch;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Two.utils.JDBCUtil;

public class BatchInsert {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = JDBCUtil.getConnection();

			conn.setAutoCommit(false);

			ps = conn.prepareStatement("insert into user(username,password) values (?,?) ");
			ps.setString(1, "m1");
			ps.setString(2, "123");

			ps.addBatch();
			ps.setString(1, "m2");
			ps.setString(2, "123");

			ps.addBatch();
			ps.setString(1, "m3");
			ps.setString(2, "123");

			ps.addBatch();

			// int update = ps.executeUpdate();

			int[] executeBatch = ps.executeBatch();

			if (executeBatch.length > 0) {
				System.out.println("成功添加");
				conn.commit();
			}
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			JDBCUtil.close(conn, ps, null);
		}

	}

}
