package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandles {

	//static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
			
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(3000);
		driver.findElement(By.name("proceed")).click();
		
		Alert alert = driver.switchTo().alert();
		String alertTxt=alert.getText();
		System.out.println("Alert text is "+alertTxt);
		if (alertTxt.equals("Please enter a valid user name")){
			System.out.println("Correct alert message");
		}
		else {
			System.out.println("Incorrect alert message");
		}
		alert.accept();
		
		driver.quit();
	}

}
