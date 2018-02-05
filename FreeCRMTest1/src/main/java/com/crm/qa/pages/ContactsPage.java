package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase{

	@FindBy(xpath="//legend[contains(text(),'Contact Information')]")
	WebElement ContactInformationTitle;
	
	public ContactsPage() {
		PageFactory.initElements(driver, this);
	}

	public boolean verifyContactTitleName() {
		//driver.switchTo().frame("mainpanel");
		System.out.println(ContactInformationTitle);
		return ContactInformationTitle.isDisplayed();
	}

}
