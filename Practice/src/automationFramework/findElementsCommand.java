package automationFramework;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementsCommand {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "http://toolsqa.wpengine.com/Automation-practice-form";
		driver.get(url);
		
		List<WebElement> sexRadioBtn = driver.findElements(By.name("sex"));
		List<WebElement> expOptions = driver.findElements(By.name("exp"));
		
		boolean bSelected = false;
		
		bSelected = sexRadioBtn.get(0).isSelected();
		int noOfSexOptions = sexRadioBtn.size();
		int noOfExpOptions = expOptions.size();
		System.out.println("No of Sex options are "+noOfSexOptions);
		System.out.println("No of Exp options are "+noOfExpOptions);
		
		for (int i=0;i<noOfExpOptions;i++) {
			String Option  = expOptions.get(i).getText();
			System.out.println(Option);
		}
		
		if (bSelected==true) {
			sexRadioBtn.get(1).click();
		}
		else {
			sexRadioBtn.get(0).click();
		}
			
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		driver.quit();
	}
	
}
