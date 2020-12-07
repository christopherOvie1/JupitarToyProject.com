package stepDef;


import base.TestBase;
import cucumber.api.java.After;
import cucumber.api.java.Before;



public class Background extends TestBase{
	//before each test case --launch the browser
	//after each test case --quit the browser
	// use java super keyword to call method initialization into action defined in the super class  TestBase
	public Background() {
		super();

	}
	//Test

	@Before 
	public void setUp() {
		TestBase.initialization();
	}

	
	@After
	public void tearDown() {
		driver.quit();
	}

}
