package automationFramework;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "http://toolsqa.wpengine.com/automation-practice-switch-windows";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String handle = driver.getWindowHandle();
		System.out.println(handle);
		driver.findElement(By.xpath("id(\'content\')/p[3]/button[1]")).click();
		System.out.println("New Message window clicked");
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);
		for (String handle1 : driver.getWindowHandles()) {
			System.out.println(handle1);
			driver.switchTo().window(handle1);
		}
		driver.close();
		driver.quit();
	}

}
