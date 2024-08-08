package seleniumjuly24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SeleniumWait {

	@Test
	public void waitExample() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); //1. implicit wait
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element =driver.findElement(By.id("uploadPicture"));// Explicit wait
		wait.until(ExpectedConditions.visibilityOf(element));
		driver.quit();
	}
	

}
