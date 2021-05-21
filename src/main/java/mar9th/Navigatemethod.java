package mar9th;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigatemethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\workspace\\FebBatch\\drivers\\chromedriver\\chromedriver.exe");
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.navigate().to("http://www.amazon.com");
		
		driver.findElement(By.linkText("Start here.")).click();
		
		driver.findElement(By.xpath("//input[@id = 'ap_email']")).sendKeys("karthikrebel786@gmail.com");
		
		driver.navigate().refresh();
		
		driver.navigate().back();
	
		
		

	}

}
