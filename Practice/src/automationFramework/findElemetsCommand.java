package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javafx.print.Printer.MarginType;

public class findElemetsCommand {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "http://demoqa.com";
		driver.get(url);
		WebElement registrationLink = driver.findElement(By.xpath("id(\'menu-item-374\')/a[1]"));
			
		//WebElement mSingle = driver.findElement(By.xpath("id(\'pie_register\')/li[2]/div[1]/div[1]/input[1]"));
		/*WebElement mMarried = driver.findElement(By.xpath("id(\'pie_register\')/li[2]/div[1]/div[1]/input[2]"));
		WebElement mDivorced = driver.findElement(By.xpath("id(\'pie_register\')/li[2]/div[1]/div[1]/input[3]"));
		WebElement hobby = driver.findElement(By.xpath("id(\'pie_register\')/li[3]/div[1]/div[1]/input[3]"));
		WebElement country = driver.findElement(By.xpath("id(\'dropdown_7\')"));*/
		registrationLink.click();
		//Thread.sleep(5000);
	//	WebElement firstName = driver.findElement(By.xpath("//*[@id=\"name_3_firstname\"]"));
	//	WebElement lastName = driver.findElement(By.id("name_3_lastname"));
	//	firstName.sendKeys("First Name");
	//	lastName.sendKeys("Last Name");
		//mSingle.click();
		driver.quit();
	
	}

}
