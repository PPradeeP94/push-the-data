package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Configuration_Reader {
	public static Properties p;

	public Configuration_Reader() throws Throwable {

		File f = new File(
				"C:\\Users\\Hari Krishna\\eclipse-workspace\\Maven_Automation\\src\\main\\java\\com\\property\\Userdata.properties");

		FileInputStream fis = new FileInputStream(f);

		p = new Properties();

		p.load(fis);
	}

	public static String getusername() {

		String username = p.getProperty("username");
		return username;
	}

	public static  String getpassword() {
		String password = p.getProperty("password");

		return password;

	}

}
