package mar9th;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\workspace\\FebBatch\\drivers\\chromedriver\\chromedriver.exe");
		
		WebDriver driver;
		
		String homepage = "Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.amazon.com");
		
		String title = driver.getTitle();
		 System.out.println("current url "+ title);
		 
		if(homepage.equals(title)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		String webpageurl = driver.getCurrentUrl();
		 System.out.println("Current url"+webpageurl);
		 
		 String WebPageSource = driver.getPageSource();
		 
		 System.out.println("current url" + WebPageSource);
	}
	
}
