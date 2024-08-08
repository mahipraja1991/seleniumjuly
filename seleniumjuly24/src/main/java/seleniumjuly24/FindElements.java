package seleniumjuly24;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FindElements {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		float a =10.6f;
		WebElement x = driver.findElement(By.id("user-name"));
		x.click();
		x.clear();
		x.sendKeys("12323");
		List<WebElement> list = driver.findElements(By.xpath("//input"));
		driver.quit();

	}

}
