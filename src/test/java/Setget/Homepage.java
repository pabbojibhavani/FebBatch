package Setget;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	WebDriver driver = null;
	
	public Homepage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	   
	}
	
	@FindBy(xpath = ("//div[@id = 'nav-xshop-container']/descendant::a[1]"))
	
	  private WebElement TodayDeals;
	
	public WebElement getSearch() {
		return TodayDeals;
	}
	
	@FindBy(xpath = "//div[@id = 'nav-xshop-container']/descendant::a[2]")
	private WebElement CustomerService;
	
	public WebElement getcustomer() {
		 return CustomerService;
	}
	
	@FindBy(xpath  = "//a[text() = 'Gift Cards'])")
			
	private WebElement GiftCards;
	
	 public WebElement getgiftcards() {
		 return GiftCards;
	 }
	 
	 @FindBy(xpath = "//a[text () = 'Registry']")
	 
	 private WebElement Registry;
	 
	 public WebElement getRegistry() {
		 return Registry;
	 }
	 
	 @FindBy(xpath = "//a[text() = 'Sell']")
	 
	 private WebElement Sell;
	 
	 public WebElement getSell() {
		 return Sell;
	 }
}
