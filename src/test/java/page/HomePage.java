package page;


import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase {
	
	
	
	
	
	//The initElements method is used to initialize web elements.
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	//page actions
	public String validateHomePageTitle() {
	return	driver.getTitle();

}
	
	
	
	

}
