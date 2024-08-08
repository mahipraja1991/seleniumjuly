package seleniumjuly24;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class takeScreenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		File sc = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        // Save the screenshot to a desired location
        Files.copy(sc, new File("./screenshots/test.png"));
        driver.quit();
	}

}
