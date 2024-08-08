package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productDetailsPage extends basePage {
	
	//1. page elements 2. page actions 3. page factory
	
	public productDetailsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(className="inventory_details_price")
	public WebElement price;
	
	@FindBy(name="add-to-cart")
	public WebElement addToCart;
	
	@FindBy(className="shopping_cart_badge")
	public WebElement shoppingBadge;
	
	public void clickAddToCart() {
		addToCart.click();
		shoppingBadge.click();
	}
	
	public String getPrice() {
		return price.getText();
	}
	
	
	
	
	
}
