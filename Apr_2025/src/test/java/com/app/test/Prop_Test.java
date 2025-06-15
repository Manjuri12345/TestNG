package com.app.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Prop_Test {

	public static void main(String[] args) {
		prop_read();
	}

	public static void prop_read() {

		try {
			File f = new File("C:\\Users\\HP\\eclipse-workspace\\Develop\\new\\new"
					+ "\\oct\\one\\Apr_2025\\src\\test\\resources\\TestData\\config.properties");
			FileReader read = new FileReader(f);
			Properties prop = new Properties();
			prop.load(read);
			String url = prop.getProperty("url");
			System.out.println(url);
			String username = prop.getProperty("username");
			System.out.println(username);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static String prop_reuse(String data) {
		String value=null;

		try {
			File f = new File("C:\\Users\\HP\\eclipse-workspace\\Develop\\new\\new"
					+ "\\oct\\one\\Apr_2025\\src\\test\\resources\\TestData\\config.properties");
			FileReader read = new FileReader(f);
			Properties prop = new Properties();
			prop.load(read);
			value = prop.getProperty(data);
			System.out.println(value);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;

	}

}
