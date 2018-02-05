package SeleniumSessions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class ReadPropertiesFile {
static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {
		
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("E:\\workspace\\OOPConcept\\src\\SeleniumSessions\\prop.properties");
		prop.load(ip);
		
		String url = prop.getProperty("url");
		String browserName=prop.getProperty("browser");
		System.out.println(browserName);
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
			//driver=new ChromeDriver();
			driver=new HtmlUnitDriver();
		}
		else if (browserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver", "F:\\geckodriver\\geckodriver.exe");
			//driver=new FirefoxDriver();
			driver=new HtmlUnitDriver();
		}
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("Before Login title is "+driver.getTitle());
		//Thread.sleep(5000);
		driver.findElement(By.id(prop.getProperty("username_id"))).sendKeys(prop.getProperty("username"));
		driver.findElement(By.name(prop.getProperty("password_name"))).sendKeys(prop.getProperty("password"));
		driver.findElement(By.id(prop.getProperty("login_btn_id"))).click();
		Thread.sleep(5000);
		System.out.println("After login title is "+driver.getTitle());
		driver.close();
	}
	
}
