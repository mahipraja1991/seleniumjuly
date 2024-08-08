package seleniumjuly24;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		JavascriptExecutor js = (JavascriptExecutor) driver;// Javascript executor
		WebElement element = driver.findElement(By.id("submitbtn"));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(1500);
		WebElement home = driver.findElement(By.xpath("//a[text()='Home']"));
		js.executeScript("arguments[0].scrollIntoView(true);", home);
		js.executeScript("arguments[0].click();", home);
		WebElement email = driver.findElement(By.id("email"));
		js.executeScript("arguments[0].value='"+ "user@gmail.com" +"';", email);
		driver.get("https://www.amazon.in");
		js.executeScript("scroll(0, 800)");
	    driver.quit();
	}

}
