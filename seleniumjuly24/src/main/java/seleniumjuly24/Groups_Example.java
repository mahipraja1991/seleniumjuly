package seleniumjuly24;

import org.testng.annotations.Test;

public class Groups_Example {     

	//ecommerce website: 150tc: 20 purchage, 50: electronics, 50: Fashion
	@Test(groups={"purchase"})
	public void method1() {
		
	}
	@Test(groups={"purchase"})
	public void method2() {
		
	}
	@Test(groups= {"electronics"})
	public void method3() {
		
	}
	@Test(groups= {"electronics"})
	public void method4() {
		
	}
	
	@Test(groups= {"fashion"})
	public void method5() {
		
	}
	
}
