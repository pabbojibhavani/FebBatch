package Setget;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signinpage {
	
	WebDriver driver;
	
	public  Signinpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath =" //div[@id = 'nav-flyout-ya-signin']/descendant::a[1]")
	
	 private WebElement Signin;
	
	public WebElement getSignin() {
		return Signin;
		
	}
	
	@FindBy(xpath =" //div[@class = 'a-row a-spacing-base']/descendant::input[1]")
	
	 private WebElement email;
	
	public void setemail(String val) {
		email.sendKeys(val);	
	}
	public WebElement getemail() {
	  return email;
		
	}
	
	@FindBy(xpath = "//div[@class = 'a-section']/descendant::span[1]")
	
	private WebElement emailbutton;
	
	public WebElement getemailbutton() {
		return emailbutton;
	}
	
	@FindBy(xpath = "//div[@class='a-section a-spacing-large']/descendant::input")
	
	private WebElement password;
	
	public void setpassword(String val) {
		password.sendKeys(val);
	}
	
	public WebElement getpassword() {
		return password;
	}
	

	@FindBy(xpath = "//div[@class = 'a-section']/descendant::input[11]")
			
	 private WebElement passwordbutton;
	
	public WebElement getpasswordbutton() {
		
		return passwordbutton;
	}
	

}
