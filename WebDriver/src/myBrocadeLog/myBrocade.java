package myBrocadeLog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class myBrocade {
	@Test(enabled=false)
	public void start() {
		
		//ChromeOptions options = new ChromeOptions();
		//options.setBinary("C:\\Selenium\\Chromedriver\\chrome.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Chromedriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		System.out.println("Welcome");
	}
	@Test(enabled=true)
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Selenium\\Firefox driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		//driver.manage().window().maximize();
		driver.get("https://my.brocade.com");
		driver.findElement(By.id("userid")).sendKeys("redesign_dontuse_ie10_sc@rackspace.com");
		driver.findElement(By.id("password")).sendKeys("password1");
	//	Thread.sleep(2000);
		driver.findElement(By.id("sso-btn-login")).click();
		//Thread.sleep(2000);
		String name = driver.findElement(By.className("utility-nav-account-name")).getText();
		String name1 = name.substring(7, 23);
		if (name1.equals("Dhakshna Moorthy")) {
			System.out.println("User Name is matched" +name1);
		}
		else{
			System.out.println("User name is Not matched");
		}
		/*String PICA=driver.findElement(By.className("content-block--heading accordion icon-chevron-up start-open")).getText().substring(0, 20);
		System.out.println("PICA title is "+PICA);
		if (PICA.equals("Products I Care About")) 
			{
			System.out.println("PICA title is matched" +PICA);
			}
		else
			{
			System.out.println("PICA title is NOT matched");
			}*/
		String sanHealth = driver.findElement(By.id("san-health-accordion")).getText().substring(0, 10);
		System.out.println("San Health title is "+sanHealth);
		if (sanHealth.equals("SAN Health")){
			System.out.println("San Health title is Matched " +sanHealth);
		}
		String downloads = driver.findElement(By.id("recent-doc-accordion")).getText().substring(0, 28);
		System.out.println("Downloads title is " +downloads);
		if (downloads.equals("Recent Documents & Downloads")){
			System.out.println("Recent downloads text is matched " +downloads);
		}
		//String edu = driver.findElement(By.className("content-block--heading accordion icon-chevron-up")).getText();
		//System.out.println("Product I Care ABout title is "+prodICareAbout);
//		System.out.println("Quick Access title is "+quickAccess);
		String quickAccess = driver.findElement(By.className("content-block--heading")).getText().substring(0, 12);
		if(quickAccess.equals("Quick Access")){
			System.out.println("Quick Access title is matched " +quickAccess);
		}
		else
		{
			System.out.println("Quick Access title is NOT matched" +quickAccess);
		}
		
		System.out.println("Recent Documents and Downloads title is "+downloads);
		//System.out.println("Education title is "+edu);
		
		//driver.close();
	}
	@Test(enabled=false)
	public static void testPrint(){
		System.out.println("This is test message");
	}

}
