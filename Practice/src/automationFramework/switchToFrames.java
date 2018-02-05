package automationFramework;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchToFrames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "http://toolsqa.com/iframe-practice-page/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		List<WebElement> noOfiFrames = driver.findElements(By.tagName("iFrame"));
		System.out.println("No of iFrames in the page "+noOfiFrames.size());
		driver.switchTo().frame(0);
		WebElement FirstName = driver.findElement(By.name("firstname"));
		WebElement LastName = driver.findElement(By.name("lastname"));
		
		FirstName.sendKeys("First Name");
		LastName.sendKeys("Last Name");
		System.out.println("Values has been entered for first and last names");
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		System.out.println("Moved to Second frame");
		driver.findElement(By.xpath("//*[@id=\'site_navigation\']/div/div[1]/a/img")).click();
		System.out.println("Image clicked in second Frame");
		driver.switchTo().defaultContent();
		
		driver.quit();

	}

}
