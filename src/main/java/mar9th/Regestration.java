package mar9th;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Regestration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\workspace\\FebBatch\\drivers\\chromedriver\\chromedriver.exe");
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.amazon.com");
		
		driver.findElement(By.linkText("Sign in")).click();
		
		driver.findElement(By.xpath("//input[@id = 'ap_email']")).sendKeys("pabbojibhavani95@gmail.com");
		
		driver.findElement(By.xpath("//input[@id = 'continue']")).click();
		
		driver.findElement(By.xpath("//input[@id = 'ap_password']")).sendKeys("Pinky@11");
		
		driver.findElement(By.xpath("//input[@id = 'signInSubmit']")).click();

	}

}
