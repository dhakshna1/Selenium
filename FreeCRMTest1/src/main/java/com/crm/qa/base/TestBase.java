package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.qa.util.TestUtil;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;

	public TestBase() {
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream(
					"E:\\workspace\\FreeCRMTest1\\" + "src\\main\\java\\com\\crm\\qa\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void Initialization() {
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browserName.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", "F:\\geckodriver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}

}
