package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class completePage extends basePage{
	
	public completePage(WebDriver driver) {
	super(driver);
	}
	
	@FindBy(className="complete-header")
	public WebElement header;
	
	@FindBy(id="back-to-products")
	public WebElement backHome;
	
	public void clickBackHome() {
		backHome.click();
	}

	public String getHeader() {
		return header.getText();
	}
	
}
