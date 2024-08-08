package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage extends basePage {
       
	
	// 1. Page elements 2. Page actions 3. Page FactoryS
	
	public loginPage(WebDriver driver) {
		super(driver);
	}
	

	   @FindBy(id="user-name")
	   public WebElement userName; 
	   
	   @FindBy(id="password")
	   public WebElement passwd;
	   
	   @FindBy(id="login-button")
	   public WebElement loginBtn; 
	    
	   public void enterUserName() {
		   userName.sendKeys("standard_user");
	   }
	   
	   public void enterPassword() {
		   passwd.sendKeys("secret_sauce");
	   }
	   
	   public void clickLogin() {
		   loginBtn.click();
	   }
	   
}
