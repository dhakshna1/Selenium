package automationFramework;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;

public class headlessBrowser {

	public static void main(String[] args) {
		
		HtmlUnitDriver unitDriver = new HtmlUnitDriver(BrowserVersion.FIREFOX_52);
		System.getProperties().put("org.apache.commons.logging.simplelog.defaultlog", "fatal");
		Logger.getLogger("com.gargoylesoftware.htmlunit").setLevel(Level.OFF);
		Logger.getLogger("org.apache.http").setLevel(Level.OFF);
		unitDriver.setJavascriptEnabled(true);
		unitDriver.get("https://google.com");
		System.out.println("Browser title is "+unitDriver.getTitle());
		WebElement searchBox = unitDriver.findElement(By.name("q"));
		searchBox.sendKeys("Selenium");
		unitDriver.findElement(By.name("btnK")).click();
		System.out.println("Current page title is "+unitDriver.getTitle());
		unitDriver.quit();

	}

}
