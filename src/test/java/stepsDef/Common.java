package stepsDef;


import base.TestBase;
import cucumber.api.java.After;
import cucumber.api.java.Before;



public class Common extends TestBase{
	
	// use java super keyword to call method initialization into action defined in the super class  TestBase
	public Common() {
		super();
	}
	

	@Before 
	public void setUp() {
		TestBase.initialization();
	}

	
	@After
	public void tearDown() {
		driver.quit();
	}

}
