package seleniumjuly24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.className("form_input"));
		driver.findElement(By.cssSelector("input#password")).click();
		driver.findElement(By.cssSelector("input.form_input")).click();
		driver.findElement(By.xpath("//input[@placeholder='Username']"));
		driver.findElement(By.xpath("//h4[text()='Accepted usernames are:']"));
		driver.findElement(By.xpath("//input[contains(@placeholder,'User')]"));
		driver.findElement(By.name("user-name")).submit();  // hitting enter
		driver.get("https://demoqa.com/links");
		System.out.println(driver.getTitle());
		Thread.sleep(500);
		driver.findElement(By.linkText("Home"));   // 1.tagname#id 2. tagname.classname
		driver.findElement(By.partialLinkText("Hom"));
		
		driver.quit();  
		 
		 
	}

}
