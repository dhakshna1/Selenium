package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetTagName;

public class navigateCommands {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "http://demoqa.com";
		driver.get(url);
		WebElement tagName=driver.findElement(By.xpath("//*[@id=\'menu-item-374\']/a"));
		//String tagName;
		System.out.println("getTagName is "+tagName.getTagName());
		//System.out.println("getCSS value is "+tagName.getCssValue(tagName));
		driver.findElement(By.xpath("//*[@id=\'menu-item-374\']/a")).click();
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.close();

	}

}
