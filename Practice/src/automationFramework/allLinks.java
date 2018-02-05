package automationFramework;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class allLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://brocade.com/";
		driver.get(url);
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File("E:\\pdmoor.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int size = links.size();
		System.out.println("Total no of links "+size);
		for (int i=0;i<size; i++) {
			System.out.println(links.get(i).getText());
		}
	driver.quit();	
	}

}
