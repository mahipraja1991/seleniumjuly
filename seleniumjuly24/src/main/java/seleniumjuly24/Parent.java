package seleniumjuly24;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Parent {
	WebDriver driver;

	@BeforeClass
	public void before() {
		driver = new EdgeDriver();
	}
	@AfterClass
	public void after() {
		driver.quit();
	}

}
