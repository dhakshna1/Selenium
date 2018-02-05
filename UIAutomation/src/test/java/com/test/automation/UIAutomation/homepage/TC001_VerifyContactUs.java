package com.test.automation.UIAutomation.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.test.automation.UIAutomation.UIActions.ContactUsPage;
import com.test.automation.UIAutomation.UIActions.HomePage;

@Test
public class TC001_VerifyContactUs extends TC001_VerifyLoginWithInvalidCredentials{

	WebDriver driver;
	//ContactUsPage Contactusspage;
	
	public void VerifyContactUs() {
		//Contactusspage = new ContactUsPage(driver);
		String text = driver.findElement(By.xpath("id(\"center_column\")/h1[1]")).getText();
		System.out.println("Captured Text is "+text);
		//log.info("");
	}
			
}
