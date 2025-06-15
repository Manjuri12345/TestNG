package com.app.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
	
	@Parameters("browser")
	@Test
	public void test1(String browser) {
		WebDriver driver = null;
		if(browser.equals("Chrome")) {
			 driver = new ChromeDriver();
			driver.get("https://www.google.com");
		}else if(browser.equals("Edge")) {
			driver = new EdgeDriver();
			driver.get("https://www.google.com");
		}
	}

}
