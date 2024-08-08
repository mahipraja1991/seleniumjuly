package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productsPage extends basePage{
	
	public productsPage(WebDriver driver) {
		super(driver);
	}
	
	// 1. Page elements 2. Page actions
	@FindBy(id= "item_4_title_link")
	public WebElement backPage;
	
	@FindBy(id="item_3_title_link")
	public WebElement tShirt;
	
	
	public void clickbackPack() {
		backPage.click();
	}
	
	public void clicktShirt() {
		tShirt.click();
	}
	

}
