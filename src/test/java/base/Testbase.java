package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Setget.CreateAccountpage;
import Setget.Homepage;
import Setget.Signinpage;
import Setget.Welcomehomepage;
import excel.Excelreader;
import project_listener.WebEvents;

public class Testbase {
	
	
	static WebDriver driver;
	
	protected Homepage  homepageobj;
	protected Signinpage signinpageobj;
	protected CreateAccountpage createaccountpageobj;
	protected Welcomehomepage Welcomehomepageobj;
	
	 public Properties obj;
	 public FileInputStream obj2;
	
	 public Excelreader datatable = null;
	 
	 public static ExtentReports extent;
	 public static ExtentTest logger;

	
	@BeforeMethod (groups = {"Homepoage" , "Smoketest" , "Regression"})
	public void beformethod() throws IOException {
		
		  Properties obj = new Properties();
		  
		  datatable = new Excelreader(System.getProperty("user.dir")+"\\src\\main\\resources\\Exceldata.xlsx");
		  
		  obj2 = new FileInputStream(System.getProperty("user.dir")+ "\\\\src\\\\main\\\\resources\\\\config.properties");
		  
		  obj.load(obj2);
		  if(obj.getProperty("Browser").equals("chrome")) {
		  
	     System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\workspace\\FebBatch\\drivers\\chromedriver\\chromedriver.exe");	
	    driver = new ChromeDriver();
		  } else {
			  System.out.println("browser");
			  System.exit(0);
		  }
		  
		  WebEvents ecapture = new WebEvents();
		  EventFiringWebDriver eventdriver = new EventFiringWebDriver(driver);
		  eventdriver.register(ecapture);
		 
	   eventdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   eventdriver.get("http://www.amazon.com");
	     
	     homepageobj = new Homepage(eventdriver);
	     signinpageobj = new Signinpage(eventdriver);
	     createaccountpageobj = new CreateAccountpage(eventdriver);
	     Welcomehomepageobj = new Welcomehomepage(eventdriver);
	}
	
	@AfterMethod (groups = {"Homepoage" , "Smoketest" , "Regression"})
	public void closeBrowser() {
		driver.quit();
		extent.endTest(logger);
		extent.flush();
		
}
	
	@BeforeTest (groups = {"Homepoage" , "Smoketest" , "Regression"})
	public void testbefore() {
		extent = new ExtentReports(System.getProperty("user.dir")+"\\report.html", true);
		extent.loadConfig(new File(System.getProperty("user.dir")+"\\target\\Config\\extent-config.xml"));
	}
	
	@AfterTest (groups = {"Homepoage" , "Smoketest" , "Regression"})
	public void testafter() {
		extent.close();
	}


}