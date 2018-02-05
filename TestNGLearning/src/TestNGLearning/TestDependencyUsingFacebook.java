package TestNGLearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestDependencyUsingFacebook {

	WebDriver driver;
	Alert alert;

	@Test
	public void openBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.get("https://www.facebook.com");
			System.out.println("driver has been opened");
			System.out.println(driver.getWindowHandle());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(dependsOnMethods = { "openBrowser" })
	@Parameters({ "email", "pass" })
	public void loginToFacebook(String email, String pass) {
		String title;
		WebElement mailId = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));
		mailId.sendKeys(email);
		password.sendKeys(pass);
		driver.findElement(By.id("u_0_y")).submit();
		// System.out.println("Verification has been completed");
		title = "Log into Facebook | Facebook";
	
		if (title.equals(driver.getTitle())) {
			System.out.println("Title has been matched and test case passed. Title is " + (driver.getTitle()));
		} else {
			System.out.println("Title has been NOT matched and test case failed " + (driver.getTitle()));
		}
	}

	@AfterTest
	public void closeBrowser() {
		System.out.println(driver.getWindowHandle());
		driver.quit();
		System.out.println("Driver has been closed");
	}
}
