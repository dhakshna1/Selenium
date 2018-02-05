package com.biggboss.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IndeedJobSearch {

	public static void main(String[] args) throws InterruptedException {
		
		//Create Firefox driver to drive the Browser
		System.setProperty("webdriver.gecko.driver","C:\\Selenium\\Firefox driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
				
		//Open Indeed home page
		driver.get("https://www.indeed.com");
		//Find what field and enter selenium 
		driver.findElement(By.id("what")).sendKeys("Selenium");
		Thread.sleep(2000);
		driver.findElement(By.id("where")).clear();
		driver.findElement(By.id("where")).sendKeys("Texas, USA");
		Thread.sleep(2000);
		driver.findElement(By.id("fj")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("prime-popover-close-button")).click();
		String s = driver.findElement(By.id("searchCount")).getText();
		String url = driver.getCurrentUrl();
		System.out.println(driver.findElement(By.id("searchCount")).getText());
		System.out.println("Total pages count is "+s+" Page URL is "+url);
		int l=s.length();
			if (l<10)
				{
					System.out.println("Length is less than 10 characters "+l);
				}
			else
				{
					System.out.println("Length is more than 10 characters "+l);
				}
		
		//Click on Find button
		
		//From Job search results page, get page title and jobs count message
		//Close the Browser
		driver.close();
	}

}
