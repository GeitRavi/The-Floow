package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {

	static Properties prop = new Properties();
	static {
		InputStream input = null;
		try {
			input = new FileInputStream("src" + File.separator + "test" + File.separator + "resources" + File.separator
					+ "config.properties");
			// load a properties file
			prop.load(input);

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
	}

	public static String getProperty(String value) {
		return prop.getProperty(value);
	}

}
