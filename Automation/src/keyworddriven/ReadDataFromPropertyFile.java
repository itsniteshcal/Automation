package keyworddriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadDataFromPropertyFile {
	public static void main(String[] args) throws Throwable {
		//open the file in read mode
		FileInputStream fis = new FileInputStream("./data/config.proper");
		//create an object of property class
		Properties prop = new Properties();
		//keep the property file to read
		prop.load(fis);
		//give the and get back the value
	String value = prop.getProperty("browser", "not present");
	System.out.println(value);
		
		
	}

}
