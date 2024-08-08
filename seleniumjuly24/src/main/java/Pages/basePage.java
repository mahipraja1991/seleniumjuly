package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class basePage {
	
	WebDriver driver;
	public basePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

}
