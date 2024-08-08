package seleniumjuly24;

import org.testng.annotations.Test;

public class TestNG_Example {
	
	@Test(priority=1, timeOut=3000)
	public void tiger() throws InterruptedException {
		System.out.println("Tiger");
	}
	@Test(enabled=true, priority=5)
	public void zebra() {
		System.out.println("Zebra");
	}
	@Test(priority=3, description = "This is special testcase that need attention")
	public void apple() {
		System.out.println("Apple");
	}
	@Test(priority=2)
	public void cucumber() {
		System.out.println("Cucumber");
	}
	@Test(priority=6)
	public void login() {
		System.out.println("loggedin");
	}
	@Test(dependsOnMethods= {"login"}, priority=4)
	public void readMessages() {
		System.out.println("reading");
	}
	

}
