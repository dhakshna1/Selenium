package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadPopUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://html.com/input-type-file/");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"fileupload\"]")).sendKeys("F:\\selenium-server-standalone-3.5.0.jar");
		
	}

}
