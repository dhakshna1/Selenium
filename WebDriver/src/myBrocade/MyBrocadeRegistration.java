package myBrocade;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MyBrocadeRegistration {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Selenium\\Firefox driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://my8stg.brocade.com");
		driver.findElement(By.xpath(".//*[@id='container']/div[3]/div/div/div/div[2]/div[1]/p[2]/a")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		String MbTitle = driver.findElement(By.xpath(".//*[@id='accountWrapper']/div/div/div[1]/div/h2")).getText();
		/*if (MbTitle.equals("Create your Brocade account"). {
			System.out.println(MbTitle +"Matched");
		}
		else
		{
			System.out.println(MbTitle +"Not matched");
		}*/
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		driver.findElement(By.id("sso-firstname")).sendKeys("First Name");
		driver.findElement(By.id("sso-lastname")).sendKeys("Last Name");
		driver.findElement(By.id("sso-company")).sendKeys("Test Company");
		driver.findElement(By.id("sso-job")).sendKeys("Job Title");
		driver.findElement(By.id("sso-phone")).sendKeys("9547874445");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
//		Select country = new Select(driver.findElement(By.xpath(".//*[@id='accountBasics']/div[1]/div[2]/div/div[1]/div/div/span")));
//		country.selectByIndex(30);
//		driver.findElement(arg0)
		driver.findElement(By.id("sso-city")).sendKeys("San Jose");
		driver.findElement(By.id("sso-email")).sendKeys("testuser_21sep325@hds.com");
		driver.findElement(By.id("sso-password2")).sendKeys("testuser_21sep325@hds.com");
		driver.findElement(By.id("sso-password")).sendKeys("password1");
		driver.findElement(By.id("sso-password2")).sendKeys("password1");
		
		
	}

}
