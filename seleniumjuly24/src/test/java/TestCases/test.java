package TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.cartPage;
import Pages.completePage;
import Pages.infoPage;
import Pages.loginPage;
import Pages.overviewPage;
import Pages.productDetailsPage;
import Pages.productsPage;

public class test extends baseTest {
	
	@Test
	public void shopping() {
		loginPage lp = new loginPage(driver);
		productsPage pp = new productsPage(driver);
		productDetailsPage pdp = new productDetailsPage(driver);
		cartPage cp = new cartPage(driver);
		infoPage ip = new infoPage(driver);
		overviewPage op = new overviewPage(driver);
		completePage comp = new completePage(driver);
		lp.enterUserName();
		lp.enterPassword();
		lp.clickLogin();
		pp.clickbackPack();
		String s = pdp.getPrice();
		pdp.clickAddToCart();
		cp.clickCheckout();
		System.out.println("Price"+ s);
		ip.enterDetails();
		op.clickFinish();
		String s1 = comp.getHeader();
		comp.clickBackHome();
		Assert.assertEquals(s1, "Thank you for your order!");// Pass or Fail criteria
	}
	
	
}
