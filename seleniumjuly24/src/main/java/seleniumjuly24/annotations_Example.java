package seleniumjuly24;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class annotations_Example {
	WebDriver driver;
	@BeforeMethod
	public void before() {
		driver = new EdgeDriver();
	}
	@AfterMethod
	public void after() {
		driver.quit();
	}
	
	@Test
	public void locators() throws InterruptedException {
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
	}
	@Test
	public void alerts() throws InterruptedException {
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.id("OKTab")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		driver.findElement(By.id("CancelTab")).click();
		Thread.sleep(1000);
		Alert obj = driver.switchTo().alert();
		obj.dismiss();
		driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
		driver.findElement(By.id("Textbox")).click();
		Alert txt = driver.switchTo().alert();
		Thread.sleep(1000);
		txt.sendKeys("1234567890");
		Thread.sleep(1000);
		txt.accept();
	}
	@Test
	public void navigation() throws InterruptedException {
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.navigate().to("https://www.saucedemo.com");
	}
	

}
