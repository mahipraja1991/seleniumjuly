package seleniumjuly24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HandleFrame {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		WebElement single = driver.findElement(By.id("singleframe"));
		driver.switchTo().frame(single);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("123");
		driver.quit();
	}

}
