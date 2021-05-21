package march19th;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class Demo5 {
	
	WebDriver driver;
  @Test
  public void test() throws InterruptedException {
	  
	  Actions act = new Actions(driver);
	
     WebElement obj =  driver.findElement(By.xpath("//a[contains(text(),\"SHOP CATEGORIES\")]"));
		
      act.moveToElement(obj).build().perform();
   	
		
  }									
  @BeforeMethod
  public void beforeClass() {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\workspace\\FebBatch\\drivers\\chromedriver\\chromedriver.exe");
		
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.purplle.com/");
		
  }

  @AfterMethod
  public void afterClass() {
	  
	 // driver.close();
  }
  
 @Test
  
    public void test1() throws InterruptedException {
	 
	   
     Actions act = new Actions(driver);
	  
	 WebElement obj =  driver.findElement(By.xpath("//a[contains(text(),\"SHOP CATEGORIES\")]"));
	 
	 act.moveToElement(obj).build().perform();
	  
	     driver.findElement(By.xpath("//a[contains(text(),\"Makeup\")][1]")).click();
	     
	     Thread.sleep(2000);
	     
	     driver.findElement(By.xpath("//a[contains(text(),\"Lipstick\")][1]")).click();
	
	     Thread.sleep(1000);
	     
	     String page = "Purplle Ultra HD Matte Mini Liquid Lipstick, Red - My First Hook-up 11 (1.6 ml)";
	     
	    String name  =  driver.findElement(By.xpath("//span[text() = 'Purplle Ultra HD Matte Mini Liquid Lipstick, Red - My First Hook-up 11 (1.6 ml)']")).getText();
	     
	    Assert.assertEquals(page, name);
 }                                                                                                                                                        
}


