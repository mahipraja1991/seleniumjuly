package seleniumjuly24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();//Select class 
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement skills = driver.findElement(By.xpath("//select[@ng-model='Skill']"));
		Select obj = new Select(skills);// Create object of select class: className obj = new ClassName();
		obj.selectByValue("AutoCAD");
		obj.selectByVisibleText("Android");
		obj.selectByIndex(11);
		driver.get("https://demoqa.com/select-menu");
		WebElement cars = driver.findElement(By.id("cars"));
		Select multi = new Select(cars);
		multi.selectByValue("audi");
		multi.selectByIndex(0);
		multi.selectByVisibleText("Saab");
		multi.deselectByIndex(0);
		multi.deselectAll();
		driver.quit();
	}

}
