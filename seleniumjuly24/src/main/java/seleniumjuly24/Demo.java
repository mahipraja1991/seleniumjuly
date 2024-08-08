package seleniumjuly24;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo {

	public static void main(String[] args) {
	
		WebDriver obj = new EdgeDriver();     //1. Open the browser
		obj.get("https://www.google.com");    // 2. Go to google.com
		obj.navigate().to("https://www.booking.com");
		System.out.println(obj.getPageSource());
		System.out.println(obj.getTitle());
		System.out.println(obj.getCurrentUrl());
		obj.quit();
		
	}

}
