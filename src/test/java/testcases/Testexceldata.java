package testcases;

import org.apache.commons.logging.Log;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.Testbase;

public class Testexceldata extends Testbase {
	public Logger log = LogManager.getLogger(Logtest.class.getName());
	private Object YourProfile;
	
  @Test
  public void test1() {
	  String TestcaseId = new Object() {}.getClass().getEnclosingMethod().getName();
	  logger = extent.startTest(TestcaseId, "test1 i am running");
	  
	  
	  log.info("fetch the username and password from the excelsheet");
	  logger.log(LogStatus.INFO, "fetch the username and password from the excelsheet");
	  int rowcount = datatable.getRowCount("logincrd");
	  String username = datatable.getCellData("logincrd", "username", 3);
	  String password = datatable.getCellData("logincrd", "password", 3);
	  
	 log.info("username ="+ username);
	 log.info("password =" + password);
	 log.info("rowcount = " + rowcount);
	 
	 log.info("login succesfully");
	 
	 try {
	 if(Welcomehomepageobj.getYourProfile().equals("YourProfile")) {
		 logger.log(LogStatus.PASS, "text");
		 Assert.assertTrue(true);
	 }	 
	 }
	  catch(Exception e) {
			 log.info("login failed");
			 Assert.assertTrue(false);
			 logger.log(LogStatus.FAIL, "text");
		 }
	 }
	  }
  


