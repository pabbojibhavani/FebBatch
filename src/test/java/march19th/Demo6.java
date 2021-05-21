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
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class Demo6 {
	
	WebDriver driver;
  @Test
  public void test() throws InterruptedException {
	  Actions act = new Actions(driver);
		
		Thread.sleep(10000);
		
		WebElement link = driver.findElement(By.xpath("(//a[@title = 'Personal'])[1]"));
		
		act.click();
		
  }
	
  
  @BeforeMethod
  public void beforeClass() {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\workspace\\FebBatch\\drivers\\chromedriver\\chromedriver.exe");
		
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.hdfcbank.com/");
		
  }

  @AfterMethod
  public void afterClass() {
	  
	  driver.close();
  }
  
  @Test
  
    public void test1() throws InterruptedException {
	  
	 Actions act = new Actions(driver);
		
	Thread.sleep(10000);
		
	WebElement link = driver.findElement(By.xpath("(//div[@class = 'CXW8mj'])[1]"));
		
	act.moveToElement(link).build().perform();

		
	driver.findElement(By.xpath("(//div[@class = 'xtXmba'])[1]")).click();
	  
  }

}
