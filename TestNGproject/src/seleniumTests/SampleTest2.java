package seleniumTests;

import org.testng.annotations.Test;

public class SampleTest2 {
	@Test (priority=1, description="This is test case to verify Login functionality")
	public void Login()
	{
		System.out.println("Login is successful");
	}
	@Test (priority=1, enabled=false)
	public void Search()
	{
		System.out.println("Search is successful");
	}
	@Test (priority=2)
	public void Logout()
	{
		System.out.println("Logout is successful");
	}
}
