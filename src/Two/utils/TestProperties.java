package Two.utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {
	public static void main(String[] args) throws FileNotFoundException, IOException {

		Properties p = new Properties();
		p.load(new FileReader("db.properties"));
		String property = p.getProperty("mysql.dataSource.driver");
		System.out.println(property);

	}
}
