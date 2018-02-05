package TestNGLearning;

import org.testng.annotations.Test;

public class NewTestNGAttributes {
  @Test(priority=1)
  public void d() {
  }
  
  @Test(dependsOnMethods= {"h"})
  public void a() {
  }
  
  @Test(priority=3)
  public void o() {
  }
  @Test(enabled=false)
  public void h() {
  }
  @Test(priority=5)
  public void f() {
  }
  @Test(priority=6)
  public void m() {
  }
}
