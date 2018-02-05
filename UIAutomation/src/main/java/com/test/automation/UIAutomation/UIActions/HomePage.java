package com.test.automation.UIAutomation.UIActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	@FindBy(xpath = "id(\"header\")/div[2]/div[1]/div[1]/nav[1]/div[1]/a[1]")
	WebElement signIn;

	@FindBy(name = "email")
	WebElement LoginEmailAddress;

	@FindBy(id = "passwd")
	WebElement LoginPassword;

	@FindBy(xpath = "id(\"SubmitLogin\")/span[1]")
	WebElement SubmitButton;

	@FindBy(xpath = "//*[@id='center_column']/div[1]/ol/li")
	WebElement authenticationFailed;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void loginToApplication(String email, String password) {
		signIn.click();
		LoginEmailAddress.sendKeys(email);
		LoginPassword.sendKeys(password);
		SubmitButton.click();
	}

	
}
