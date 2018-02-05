package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "//td[contains(text(),'User: Naveen K')]")
	WebElement userNameLabel;

	@FindBy(xpath = "//td//a[contains(text(),'Upgrade your account') and @href='https://www.freecrm.com/upgrade.cfm']")
	WebElement userStatusMessage;

	@FindBy(xpath = "//a[@title='Contacts']")
	WebElement contactsLink;
	
	@FindBy(xpath="//a[contains(text(),'New Contact')]")
	WebElement newContactLink;

	@FindBy(xpath = "//a[contains(text(),'Deals')]")
	WebElement dealsLink;

	@FindBy(xpath = "//a[contains(text(),'Tasks')]")
	WebElement tasksLink;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
		//System.out.println(driver.getTitle());
		//return pageTitle;
	}
	public boolean verifyCorrectUserName() {
		driver.switchTo().frame("mainpanel");
		return userNameLabel.isDisplayed();
	}
	public String verifyUserStatusMessage() {
		driver.switchTo().frame("mainpanel");
		System.out.println("Switched to mainpanel");
		String userStatusTxt = userStatusMessage.getText();
		System.out.println(userStatusTxt);
		return userStatusTxt;
	}
	public ContactsPage clickOnContactsLink() throws InterruptedException {
		//driver.switchTo().frame("mainpanel");
		Actions act = new Actions(driver);
		act.moveToElement(contactsLink).build().perform();
		Thread.sleep(5000);
		newContactLink.click();
		System.out.println("New Contacts Link clicked");
		return new ContactsPage();
	}
	public DealsPage clickOnDealsLink() {
		dealsLink.click();
		return new DealsPage();
	}
	public TasksPage clickOnTasksLink() {
		tasksLink.click();
		return new TasksPage();
	}
	

}
