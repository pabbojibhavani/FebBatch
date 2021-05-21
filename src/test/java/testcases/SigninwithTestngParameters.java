package testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.Testbase;

public class SigninwithTestngParameters extends Testbase {

  @Parameters({"username" ,"password"})
  @Test
  public void login(String uname ,String password) {
	  
	  signinpageobj.getSignin().click();
	  
	  signinpageobj.setemail(uname);
	  
	  signinpageobj.getemailbutton().click();
	  
	  signinpageobj.setpassword(password);
	  
	  signinpageobj.getpasswordbutton().click();
	  
	  
  }
   }
