package com.sikuli.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LICEditHomePage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\work\\Selenium\\SikuliProject\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
//		String url = 
		
		driver.get("http://admin:admin@nc-perfapp:8080/LicEdit/index.html");
		
		driver.manage().window().maximize();
	}

}
