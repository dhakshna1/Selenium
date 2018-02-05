package seleniumTests;

import junit.framework.Assert;

import org.testng.annotations.Test;

@SuppressWarnings("deprecation")
public class SampleTest1 {

	@Test 
	public void testA()
	{
		Assert.assertEquals("Google", "Google");
	}
	@Test 
	public void testC()
	{
		Assert.assertEquals("Gmail", "Google");
	}
	@Test 
	public void testB()
	{
		Assert.assertEquals("Yahoo", "Yahoo");
	}
}
