package seleniumjuly24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class fileUpload {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\PC\\Downloads\\Manual Testing Guide.pdf");
		Thread.sleep(5000);
		driver.quit();
	}

}
