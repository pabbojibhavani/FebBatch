package mar9th;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Byparticallinktext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\workspace\\FebBatch\\drivers\\chromedriver\\chromedriver.exe");
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.bigbasket.com");
		
		driver.findElement(By.partialLinkText("Contact ")).click();
		
		driver.findElement(By.partialLinkText("Login")).click();
		
		driver.findElement(By.id("otpEmail")).sendKeys("8297353187");
		
		driver.findElement(By.linkText("Login Using OTP")).click();
		
		
		
		

	}

}
