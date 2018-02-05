package com.test.automation.UIAutomation.UIActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends HomePage{

	public ContactUsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	WebDriver driver;
	@FindBy(xpath = "id(\"contact-link\")/a[1]'")
	WebElement ContactUsLink;
	
	@FindBy(xpath="id(\"center_column\")/h1[1]")
	WebElement CustomerServiceTitle;
	
	/*public ContactUsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}*/
	public void LinkClick() {
		ContactUsLink.click();
	}
	
}
