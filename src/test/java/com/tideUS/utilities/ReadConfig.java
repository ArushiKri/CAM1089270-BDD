package com.tideUS.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadConfig {
	Properties prop;
	public ReadConfig() throws FileNotFoundException  {
		File src= new File("./Configuration/config.properties");
		
			
				FileInputStream fis= new FileInputStream(src);
			
			prop=new Properties();
			
		
	}
	
	public String baseURL() {
		System.out.println(prop.getProperty("url"));
		return prop.getProperty("url");
		
	}

}
