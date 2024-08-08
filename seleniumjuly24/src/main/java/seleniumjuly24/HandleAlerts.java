package seleniumjuly24;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
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
