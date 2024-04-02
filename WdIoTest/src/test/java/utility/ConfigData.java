package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigData {

	Properties properites;

	public ConfigData() {

		try {

			File src = new File("./src/test/resources/Config.properties");

			FileInputStream fis = new FileInputStream(src);

			properites = new Properties();

			properites.load(fis);

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public String getData(String key) {

		return properites.getProperty(key);
	}

}
