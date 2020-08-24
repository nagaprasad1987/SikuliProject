package com.sikuli.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	
	WebDriver driver;
	
	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@placeholder='First Name']")
	@CacheLookup
	WebElement txtFirstName;
	
	@FindBy(xpath = "//input[@placeholder='Last Name']")
	@CacheLookup
	WebElement txtLastName;
	
	@FindBy(xpath = "//h2[(text()='Register')]")
	@CacheLookup
	WebElement headerRegister;
	
	@FindBy(xpath = "//input[@id='imagesrc']")
	@CacheLookup
	WebElement btnChooseFile;
	
	public void setFirstName(String firstName)
	{
		txtFirstName.sendKeys(firstName);
	}
	
	public void setLastName(String lastName)
	{
		txtLastName.sendKeys(lastName);
	}
			
	public String getHeader()
	{
		return headerRegister.getText();
	}
	
	public void clickOnChooseFile()
	{
		btnChooseFile.click();
	}
	
	public boolean isChooseFileButtonEnabled()
	{
		return btnChooseFile.isEnabled();
	}
	
	public String getTitle()
	{
		return driver.getTitle();
	}

}
