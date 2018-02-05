package TestNGLearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAssertion {
	WebDriver driver;

	@BeforeTest(groups= {"A"})
	public void invokeBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.get("https://www.gmail.com");
			Reporter.log("This is reporting text");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(groups= {"A"})
	public void testEquality() {
		Assert.assertEquals(true, isEqual(10, 10));
		System.out.println("pdmoor");
	}

	public boolean isEqual(int a, int b) {
		if (a == b) {
			return true;
		} else {
			return false;
		}
	}

	@Test(groups= {"A"})
	public void getTitle() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Gmail");
		System.out.println("DHakshna");
		Reporter.log("This is getTitle method");
	}

	@AfterTest(groups= {"A"})
	public void closeBrowser() {
		driver.quit();
	}
}
