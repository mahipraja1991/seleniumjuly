package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cartPage extends basePage {

		public cartPage(WebDriver driver) {
		super(driver);
		}

		@FindBy(id= "checkout")
		public WebElement checkOut;
		
		
	public void clickCheckout() {
	checkOut.click();
	}
		
		
}
