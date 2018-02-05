package TestNGLearning;

import org.testng.annotations.Test;

public class TestGrouping {
  @Test (groups = {"A"})
  public void f1() {
	  System.out.println("Function1");
  }
  @Test (groups = {"B"})
  public void f2() {
	  System.out.println("Function2");
  }
  @Test (groups = {"A"})
  public void f3() {
	  System.out.println("Function3");
  }
  @Test (groups = {"C"})
  public void f4() {
	  System.out.println("Function4");
  }
  @Test (groups = {"A"})
  public void f5() {
	  System.out.println("Function5");
  }
  @Test (groups = {"C"})
  public void f6() {
	  System.out.println("Function6");
  }
  @Test (groups = {"A"})
  public void f7() {
	  System.out.println("Function7");
  }
  
}
