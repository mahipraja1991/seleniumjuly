package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class overviewPage extends basePage {
	
	public overviewPage(WebDriver driver) {
	super(driver);
	}
	
	@FindBy(id="finish")
	public WebElement finish;
	
	public void clickFinish() {
		finish.click();
	}

}
