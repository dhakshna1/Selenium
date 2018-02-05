package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://spicejet.com");
		//Thread.sleep(2000);;
		Actions action = new Actions(driver);
		//action.moveToElement(driver.findElement(By.linkText("Login / Signup"))).build().perform();
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\'ctl00_HyperLinkLogin\']"))).build().perform();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Agents")).click();
		
		
		//*[@id="ctl00_HyperLinkLogin"]

	}

}
