package march19th;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Demo1 {
  @Test
  public void test() {
	  System.out.println("pinky");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("karthik");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("pinky and karthik");
  }
  
  @Test
  
    public void test1() {
	  System.out.println("falthu");
  }
}
