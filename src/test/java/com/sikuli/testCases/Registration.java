package com.sikuli.testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.sikuli.pageObjects.RegistrationPage;

public class Registration extends BaseClass{

	@Test
	public void registration()
	{
		try {
			Thread.sleep(3000);
			RegistrationPage registration = new RegistrationPage(driver);
			System.out.println(registration.getTitle());
			logger.info("Got the title of the page");
			
			System.out.println(registration.getHeader());
			
			registration.setFirstName("naga");
			logger.info("Entered firstname");
			
			registration.setLastName("prasad");
			logger.info("entered last name");
			
			Thread.sleep(3000);
			if(registration.isChooseFileButtonEnabled())
			{
				logger.info("choose file button enabled");
				registration.clickOnChooseFile();
				Thread.sleep(3000);
				logger.info("Clicked on Choose file button");
				logger.info("Test passed");
			}
			else
			{
				logger.info("choose file button not enabled");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
