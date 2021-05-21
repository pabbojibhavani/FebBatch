package march19th;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Demo2 {
  @Test
  public void test() {
	  System.out.println("gorrer");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("monkey");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("donkey");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("pig");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("buffloes");
  }
  
  @Test
     public void test1(){
	  System.out.println("cow");
  }
}
