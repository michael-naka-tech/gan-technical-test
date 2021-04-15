package gan.technical.test.utils;

import java.io.*;
import java.util.Properties;

public class PropertyReader {

	private static Properties prop = null;
	private static Properties testData = null;

	private static synchronized void loadProp() throws IOException {
		prop = new Properties();
		File propFile = new File("src/test/resources/properties/gan-technical-test.properties");
		InputStream inputStream = new FileInputStream(propFile);
		prop.load(inputStream);
		inputStream.close();
	}

	public static String getPropValues(String key) throws IOException {
		if (prop == null) {
			loadProp();
		}
		return prop.getProperty(key);
	}

}

