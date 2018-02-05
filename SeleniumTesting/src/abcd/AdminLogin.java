package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdminLogin {

	
	public static void main(String[] args) {
	
		//System.setProperty("webdriver.gecko.driver","C:\\Selenium\\Firefox driver\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
//		driver.findElement(By.name("username")).sendKeys("admin");
//		driver.findElement(By.name("password")).sendKeys("admin@123");
//		driver.findElement(By.id("tdb1")).click();
//		
		
		String pageTitle=driver.getTitle();
		String url=driver.getCurrentUrl();
		System.out.println("Current URL" +url);
		System.out.println("Page title " +pageTitle);
		driver.switchTo().defaultContent();
		driver.navigate().to("https://www.brocade.com");
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();
		driver.navigate().to("http://google.com");
		driver.findElement(By.linkText("Gmail")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//driver.findElement(By.linkText("Sign in")).click();
		//driver.findElement(By.xpath("//*[@id='gbw']/div/div/div[1]/div[1]/a")).click();
		//driver.findElement(By.className("gmail-nav__nav-link gmail-nav__nav-link__sign-in")).click();
		driver.findElement(By.cssSelector(".gmail-nav__nav-link.gmail-nav__nav-link__sign-in")).click();
		//Thread.sleep(3000);
		driver.findElement(By.id("identifierId")).sendKeys("pdmoor");
		
		//driver.close();
	}

}
 