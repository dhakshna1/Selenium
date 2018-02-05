package com.test.automation.UIAutomation.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import com.test.automation.UIAutomation.UIActions.HomePage;

@Test
public class TC001_VerifyLoginWithInvalidCredentials {
	WebDriver driver;
	HomePage homepage;
	@BeforeTest
	public void setup() {
		//System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
	}
	@Test
	public void verifyLoginWithInvalidCredentials() {
		homepage = new HomePage(driver);
		homepage.loginToApplication("test@gmail.com", "password");
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id='center_column']/div[1]/ol/li")).getText(),"Authentication failed.");
		String text=driver.findElement(By.xpath("//*[@id='center_column']/div[1]/ol/li")).getText();
		System.out.println("Captured tex is "+text);
	}
	@AfterTest
	public void endTest() {
		driver.close();
	}
}
