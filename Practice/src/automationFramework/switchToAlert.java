package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchToAlert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "http://toolsqa.wpengine.com/automation-practice-switch-windows";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("id(\'alert\')")).click();
		driver.findElement(By.id("alert")).click();
		Alert myAlert = driver.switchTo().alert();
		myAlert.accept();
		System.out.println("Alert is accepted");
		driver.close();
	}

}
