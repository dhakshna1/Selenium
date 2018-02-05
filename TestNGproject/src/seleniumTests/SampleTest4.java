package seleniumTests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTest4 {

	@BeforeClass
	public void Login()
	{
		System.out.println("Login Successful");
	}
	@Test 
	public void Search()
	{
		System.out.println("Search is Successful");
	}
	@Test (dependsOnMethods={"Search"})
	public void AdvancedSearch()
	{
		System.out.println("Advance Search is successful");
	}
	@Test (dependsOnMethods={"AdvancedSearch"})
	public void BuyProducts()
	{
		System.out.println("Buy Products is successful");
	}
	@AfterClass
	public void Logout()
	{
		System.out.println("Logout is successful");
	}
}
