package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	// PageFactory or OR
	@FindBy(name = "username")
	WebElement username;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement loginBtn;

	@FindBy(xpath = "//button[contains(text(),'Sign Up')]")
	WebElement signUpBtn;

	@FindBy(xpath = "//img[contains(@class,'img-responsive')]")
	WebElement crmLogo;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public String validateLoginPageTitle() {
		String pageTitle = driver.getTitle();
		return pageTitle;
	}

	public boolean validateCRMImage() {
		return crmLogo.isDisplayed();
	}
	
	public HomePage login(String un, String pwd) throws InterruptedException {
	username.sendKeys(un);
	password.sendKeys(pwd);
	System.out.println(un);
	System.out.println(pwd);
	//new WebDriverWait(driver,100).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(loginBtn));
	
	//loginBtn.click();
	Thread.sleep(3000);
	//Actions act = new Actions(driver);
	//Thread.sleep(2000);
	//act.moveToElement(loginBtn).build().perform();
	loginBtn.click();
	System.out.println("Login button clicked");
	//loginBtn.act.build().perform();
	//loginBtn.click();
	Thread.sleep(1000);
	return new HomePage();
	//Thread.sleep(3000);
	}
}
