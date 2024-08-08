package seleniumjuly24;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class test1 {
	@Test
	public void wait2() {

		WebDriver driver = new EdgeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); //1. implicit wait
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element =driver.findElement(By.id("uploadPicture"));// Explicit wait
		wait.until(ExpectedConditions.visibilityOf(element));
		driver.quit();
	}
	
	@Test
	public void Alerts() throws InterruptedException {
		WebDriver driver = new EdgeDriver();
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
		Thread.sleep(1000);
		driver.quit();	
	}
}
