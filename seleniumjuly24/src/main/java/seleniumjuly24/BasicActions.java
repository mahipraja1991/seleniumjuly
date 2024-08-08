package seleniumjuly24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BasicActions {

	public static void main(String[] args) {
	WebDriver driver = new EdgeDriver();
	driver.get("https://www.saucedemo.com");
	 driver.findElement(By.name("user-name")).click();//Click, right click, scrolling, copy/paste(clicking), 
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	driver.findElement(By.id("user-name")).clear();
	driver.findElement(By.id("login-button")).submit(); 
	boolean x = driver.findElement(By.id("login-button")).isDisplayed();
	boolean y = driver.findElement(By.id("login-button")).isEnabled();
	boolean z = driver.findElement(By.id("login-button")).isSelected();  // checkboxes
	System.out.println(x);
	System.out.println(y);
	System.out.println(z);
	driver.quit();
	}

}
