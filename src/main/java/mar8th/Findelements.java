package mar8th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\workspace\\FebBatch\\drivers\\chromedriver\\chromedriver.exe");
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		driver.get("http://www.bigbasket.com");
		
		driver.findElement(By.id("input")).sendKeys("vegtables");
		
		//driver.findElement(By.className("btn btn-default bb-search")).click();//
		
		driver.findElement(By.linkText("About Us")).click();

	}

}
