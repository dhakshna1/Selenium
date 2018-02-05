package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testingCloseCommand {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "http://demoqa.com/frames-and-windows";
		driver.get(url);
		driver.findElement(By.xpath("id(\'tabs-1\')/div[1]/p[1]/a[1]")).click();
		
		driver.quit();

	}

}
