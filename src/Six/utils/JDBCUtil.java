package Six.utils;

import java.io.FileReader;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCUtil {
	private static String URL;
	private static String USERNAME;
	private static String PASSWORD;
	private static String DRIVER;

	static {
		try {

			Properties p = new Properties();
			// p.load(new FileReader("db.properties"));

			InputStream in = JDBCUtil.class.getClassLoader().getResourceAsStream("db.properties");
			p.load(in);
			DRIVER = p.getProperty("mysql.dataSource.driver");
			URL = p.getProperty("mysql.dataSource.url");
			USERNAME = p.getProperty("mysql.dataSource.username");
			PASSWORD = p.getProperty("mysql.dataSource.password");

			Class.forName(DRIVER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	public static void close(Connection conn, Statement st, ResultSet rs) {
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
