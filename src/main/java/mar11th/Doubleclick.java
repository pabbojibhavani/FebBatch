package mar11th;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\workspace\\FebBatch\\drivers\\chromedriver\\chromedriver.exe");
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.amazon.com");
		
		Actions act = new Actions(driver);
		
		driver.findElement(By.xpath("//input[@id = 'twotabsearchtextbox']")).sendKeys("Fashion");
		
		act.moveToElement(driver.findElement(By.xpath("//input[@id = 'twotabsearchtextbox']"))).doubleClick().build().perform();

	}
	

}
