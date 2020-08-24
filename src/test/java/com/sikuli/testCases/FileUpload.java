package com.sikuli.testCases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class FileUpload {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\work\\Selenium\\SikuliProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		String filepath = "C:\\work\\images\\";
		String inputFilePath = "C:\\work\\images\\";
		Screen s = new Screen();

		Pattern fileInputTextBox = new Pattern(filepath + "Fileinputtextbox.PNG");
		Pattern openButton = new Pattern(filepath + "Openbutton.PNG");

		driver.get("http://demo.automationtesting.in/Register.html");

		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(By.xpath("//input[@id='imagesrc']"))).click().build().perform();
		
		s.wait(fileInputTextBox, 20);
		s.type(fileInputTextBox, inputFilePath+"Apple.PNG");
		s.click(openButton);

	}

}
