package seleniumTests;

import org.testng.annotations.Test;

public class SampleTest3 {
	@Test (alwaysRun=true)
	public void Login()
	{
		System.out.println("Login is successful");
	}
	@Test (dependsOnMethods={"Login"})
	public void Search()
	{
		System.out.println("Search is successful");
	}
	@Test (dependsOnMethods={"Search"})
	public void Logout()
	{
		System.out.println("Logout is successful");
	}
}
