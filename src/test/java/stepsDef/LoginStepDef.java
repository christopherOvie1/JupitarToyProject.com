package stepsDef;


import cucumber.api.java.en.And;
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
	 @Given("^user is on \"([^\"]*)\"$")
	public void userIsOn(String url)  {
		loginPage.GoToURL(url);
		String homePageTitle = homePage.validateHomePageTitle();
		System.out.println(homePageTitle);
		//Assert.assertEquals(url,homePage.validateHomePageTitle());
	}
	@Given("^user click login link$")
	public void user_click_login_link(){
		loginPage.clickLoginLink();
	}

	@And("^user attempts to login by entering  \"([^\"]*)\"  and  \"([^\"]*)\" on a pop up window$")
	public void userAttemptsToLoginByEnteringAndOnAPopUpWindow(String username, String password) throws Throwable {
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

	 @And("^user clicks terms of reference$")
	public void userClicksTermsOfReference() {
		loginPage.clickTermsOfAgreementCheckBox();
	}

	@When("^user click on login button$")
	public void userClickOnLoginButton() {
		loginPage.clickLoginButton();
	}


}
