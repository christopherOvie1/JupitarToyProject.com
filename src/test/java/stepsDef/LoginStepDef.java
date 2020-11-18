package stepsDef;

import org.junit.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import page.HomePage;
import page.LoginPage;

public class LoginStepDef{
	
	private HomePage homePage;
	private  LoginPage loginPage;
	
	 public LoginStepDef() {
		 homePage = new HomePage();
		 loginPage = new LoginPage();
	 }
	
	@Given("^user is on home page$")
	public void user_is_on_home_page() throws Throwable {	
	String homePageTitle = homePage.validateHomePageTitle();
	System.out.println(homePageTitle);
	Assert.assertEquals("Jupiter Toys", homePageTitle);
   
	}
	@Given("^user click login link$")
	public void user_click_login_link() throws Throwable {
		loginPage.clickLoginLink();
	}


	
	@When("^user attempts to login by entering  \"([^\"]*)\"  and  \"([^\"]*)\"$")
	public void user_attempts_to_login_by_entering_and(String username, String password) throws Throwable {
		loginPage.loginIntoApp(username, password);
		
	}

	@Then("^user  \"([^\"]*)\" should be able to confirm login is successful$")
	public void user_should_be_able_to_confirm_login_is_successful(String username) throws Throwable {
	String actualUsername=loginPage.validateCorrectUserName();
	System.out.println(actualUsername);
	Assert.assertEquals(username,actualUsername);

	}
	@Then("^user log out of the application$")
	public void user_log_out_of_the_application() throws Throwable {
		loginPage.clickLogoutLink();
		loginPage.clickLogoutBtn();
	}
	
}
