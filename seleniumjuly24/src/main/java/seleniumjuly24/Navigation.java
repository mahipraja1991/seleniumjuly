package seleniumjuly24;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new EdgeDriver();
	driver.get("https://demoqa.com/automation-practice-form");
	driver.manage().window().maximize();
	driver.navigate().back();
	Thread.sleep(1000);
	driver.navigate().forward();
	driver.navigate().refresh();
	driver.navigate().to("https://www.saucedemo.com");
	driver.quit();
	}

}
