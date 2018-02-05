package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CustomXPath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/SignUp?hl=en");
		/*
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("redesign@lmco.com");
		driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("password1");
		driver.findElement(By.xpath("//input[@id='sso-btn-login']")).click();
		*/
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		/*
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//nav[@id=\'mm-primary-nav\']//a[contains(text(),'Products') and @href='#']")))
		.build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//[contains(text(),'My Registered Assets')")).click();*/
		/*
		List<WebElement> links = driver.findElements(By.tagName("button"));
		System.out.println(links.size());
		for(int i=0;i<links.size();i++) {
			System.out.println(links.get(i).getText());
		}*/
		driver.findElement(By.xpath("//div[@role='option' and @id=':i']")).click();
		//driver.quit();
		List<WebElement> list  = driver.findElements(By.xpath("//div[@class='goog-menuitem-content']"));
		int listCnt=list.size();
		System.out.println(list.size());
		
		for(int i=0;i<listCnt;i++) {
			String countryName=list.get(i).getText();
			System.out.println(countryName);
			if(countryName.equals("Ireland")) {
				list.get(i).click();
			}
		}
		
	}

}
