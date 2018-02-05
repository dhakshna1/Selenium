package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlerPopUps {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[3]")).click();
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();
		String PartentWindow = it.next();
		System.out.println("Parent window id is "+PartentWindow);
		String ChildWindow=it.next();
		System.out.println("Child window id is" +ChildWindow);
		driver.switchTo().window(ChildWindow);
		Thread.sleep(2000);
		driver.getTitle();
		System.out.println("Child window title is "+driver.getTitle());
		driver.close();
		driver.switchTo().window(PartentWindow);
		System.out.println("Parent window title is "+driver.getTitle());
		driver.close();
		

	}

}
