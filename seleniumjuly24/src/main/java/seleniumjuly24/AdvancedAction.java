package seleniumjuly24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class AdvancedAction {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Static.html");
		WebElement start = driver.findElement(By.id("node"));
		WebElement end = driver.findElement(By.id("droparea"));
		Actions act = new Actions(driver);    // Classname obj = new ClassName();
		act.dragAndDrop(start, end).perform();
		act.doubleClick(end).perform();
		Thread.sleep(1000);
		act.contextClick(end).perform();
	    Thread.sleep(1000);
		WebElement video = driver.findElement(By.xpath("//a[text()='Video']"));
		WebElement youtb = driver.findElement(By.xpath("//a[text()='Youtube']"));
		act.moveToElement(video).moveToElement(youtb).click().perform();
		act.clickAndHold(driver.findElement(By.xpath("//a[text()='Home']"))).perform();
		driver.quit();
	}

}
