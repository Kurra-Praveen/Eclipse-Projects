package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigData {
	
	Properties properties;
	
	public ConfigData(){
		
		File file=new File("./testData/config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(file);
			
			properties = new Properties();
			
			properties.load(fis);
			
		} catch (Exception e) {
			
			System.out.println("Unable to read file");
		}
		
	}
	/**
	 * 
	 * @param key
	 * @return the value from the property file with the required key
	 */
	public String getStringData(String key) {
		
		return properties.getProperty(key);
	}
	
	/**
	 * 
	 * @param key
	 * @return the numeric value from the property file 
	 */
	public int getNumericData(String key) {
		
		return Integer.parseInt(properties.getProperty(key));
	}

}
