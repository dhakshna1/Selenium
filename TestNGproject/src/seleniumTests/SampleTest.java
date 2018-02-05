package seleniumTests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest {
	@Test
	public void verifyTitle()
	{
		System.setProperty("webdriver.gecko.driver","F:\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http:\\www.gmail.com");
		String Actual = driver.getTitle();
		Assert.assertEquals(Actual, "Gmail");
		
	}

}
