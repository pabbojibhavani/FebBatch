package testcases;

import org.testng.annotations.Test;

import base.Testbase;

public class Homepagetestcases extends Testbase {
	
	
  @Test(groups = {"Homepoage" , "Smoketest" , "Regression"}  ,invocationCount = 3)
   void Signin() throws Exception {
	 // click on Signin button;
	  Thread.sleep(10000);
	  signinpageobj.getSignin().click();
	  
	 
  }
  
  @Test(groups = {"Homepoage" , "Regression"})
  
   void Sell() throws InterruptedException {
	  homepageobj.getSell().click();
	  Thread.sleep(2000);
  }
	

}
