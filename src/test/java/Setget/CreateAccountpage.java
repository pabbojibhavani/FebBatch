package Setget;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountpage {
	
	WebDriver driver;
	
	public  CreateAccountpage(WebDriver driver) {
		this.driver = driver;
	    PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class = 'a-section a-spacing-base']/descendant::a[6]")
	
	private WebElement creataccount;

	public WebElement getcreataccount() {
		return creataccount;
	}
	
	@FindBy(xpath = "//div[@class = 'a-row a-spacing-base']/descendant::input")
	
	private WebElement firstname;
	
	public void setfirstname(String val) {
		firstname.sendKeys(val);
	}
	
	public WebElement getfirstname() {
		return firstname;
	}
	
	@FindBy(xpath =" //div[@class = 'a-row a-spacing-base']/descendant::input[1]")
	
	 private WebElement email;
	
	public void setemail(String val) {
		email.sendKeys(val);	
	}
	public WebElement getemail() {
	  return email;
	
  }
	
     @FindBy(xpath = "//div[@class='a-section a-spacing-large']/descendant::input")
	
	private WebElement password;
	
	public void setpassword(String val) {
		password.sendKeys(val);
	}
	
	public WebElement getpassword() {
		return password;
	}
	
     @FindBy(xpath = "//div[@class = 'a-row a-spacing-base']/descendant::input")
	
	private WebElement repassword;
	
	public void setrepassword(String val) {
		repassword.sendKeys(val);
	}
	
	public WebElement getrepassword() {
		return repassword;
	}
	
	
	@FindBy(xpath = "//div[@class = 'a-row a-spacing-extra-large']/descendant::input")
	
	private WebElement createaccountamazon;
	
	public WebElement getcreateaccountamazon() {
		return createaccountamazon;
	}
	
	
	

}

