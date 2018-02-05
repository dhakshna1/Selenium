package TestNGLearning;

import org.testng.annotations.*;

public class TestAnnotations {
  @Test
  public void f1() {
	  System.out.println("Inside F1");
  }
  
  @Test
  public void f2() {
	  System.out.println("Inside F2");
	  
  }
  
  @BeforeTest
  public void beforeAnyTests() {
	  System.out.println("Before Any Test");
	  
  }
  @AfterTest
  public void afterAllTests() {
	  System.out.println("After All the Tests");
  }
  @BeforeMethod
  public void beforeEveryMethod() {
	  System.out.println("Before every Test method");
	  
  }
  
  @AfterMethod
  public void afterEveryMethod() {
	  System.out.println("After every test method");
	  
  }
  @BeforeClass
  public void beforeClass()
  {
	  System.out.println("Before Class");
  }
  @AfterClass
  public void afterClass() {
	  System.out.println("After Class");
	  
  }
 }
