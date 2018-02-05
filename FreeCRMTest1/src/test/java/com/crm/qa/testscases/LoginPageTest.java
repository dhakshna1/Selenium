package com.crm.qa.testscases;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;

	public LoginPageTest() {
		// TODO Auto-generated constructor stub
		super();
	}

	@BeforeMethod
	public void setup() {
		Initialization();
		loginPage = new LoginPage();
	}

	@Test (enabled=true)
	public void loginPageTitleTest() {
		String pageTitle = loginPage.validateLoginPageTitle();
		System.out.println(pageTitle);
		Assert.assertEquals(pageTitle, "#1 Free CRM for Any Business: Online Customer Relationship Software");
	}

	@Test (enabled=true)
	public void crmImageLogoTest() {
		boolean imgTest = loginPage.validateCRMImage();
		assertTrue(imgTest);
		System.out.println(imgTest);
	}
	@Test
	public void loginFunctionalityTest() throws InterruptedException {
	homePage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
