package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class infoPage extends basePage {
	
	public infoPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="first-name")
	public WebElement fName;
	
	@FindBy(id="last-name")
	public WebElement lName;
	
	@FindBy(id="postal-code")
	public WebElement zCode;
	
	@FindBy(id="continue")
	public WebElement cont;
	
	public void enterDetails() {
		fName.sendKeys("Rajnish");
		lName.sendKeys("K");
		zCode.sendKeys("434234234");
		cont.click();
	}
	

}
