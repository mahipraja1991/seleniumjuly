package seleniumjuly24;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameters_testNG extends Parent {
	
	@Test
	@Parameters({"url", "url2"})
	public void navigation(String url, String url2) throws InterruptedException {
		driver.get(url2);
		driver.manage().window().maximize();
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.navigate().to(url);
	}

}
