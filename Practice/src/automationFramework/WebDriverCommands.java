package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "http://www.store.demoqa.com";
		driver.get(url);
		driver.manage().deleteAllCookies();
		String title = driver.getTitle();
		int titleLen=title.length();
		System.out.println("Title of the page is "+title);
		System.out.println("Ttile length is "+titleLen);
		String pageSource = driver.getPageSource();
		int pageSourceLen=pageSource.length();
		System.out.println("Page source length is "+pageSourceLen);
		System.out.println("Page source is "+pageSource);
		Thread.sleep(1000);
		driver.quit();
		
	}

}
