package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import base.TestBase;

public class LoginPage extends TestBase{
	
	//object repositories
	@FindBy(how=How.CSS,using ="#nav-login > ng-login > a")
	WebElement loginLink;
	
	@FindBy(how=How.ID,using ="loginUserName")
	WebElement usernameTxtField;
	
	@FindBy(how=How.ID,using ="loginPassword")
	WebElement passwordTxtField;

	@FindBy(how=How.ID,using ="agree")
	WebElement termsOfAgreementCheckBox;

	@FindBy(how=How.XPATH,using ="//button[@type='submit']")
	WebElement loginSubmitBtn;
	
	@FindBy(how=How.CSS,using ="#nav-user > a > span")
	WebElement userNameLabel;
	
	@FindBy(how=How.CSS,using ="#nav-logout > a > span")
	WebElement logoutLink;
	
	@FindBy(how=How.CSS,using ="body > div.popup.modal.hide.ng-scope.in > div.modal-footer > a.btn.btn-success")
	WebElement logoutBtn;

	@FindBy(how=How.CSS,using ="#login-error > strong ")
	WebElement loginErrorMsg;

	@FindBy(how = How.XPATH, using = "//*[@class= 'btn btn-cancel']")
	WebElement cancelBtn;
	
	//page actions
	public LoginPage() {
	PageFactory.initElements(driver, this);
	}

	public void goToURL(String url)
	{
		driver.get(url);
	}
	public void GoToURL(String url)
	{
		driver.get(url);
	}

   public void clickLoginLink() {
	loginLink.click();
    }


   public void loginIntoApp(String username, String password)  {
	usernameTxtField.sendKeys(username);
	passwordTxtField.sendKeys(password);
   }
   public void clickTermsOfAgreementCheckBox(){
	 termsOfAgreementCheckBox.click();
 }
   public String validateCorrectUserName() {
	return  userNameLabel.getText();
   }
   public void clickLoginButton() throws InterruptedException {

	   loginSubmitBtn.click();
   }
   
   public void clickLogoutLink() {
	   logoutLink.click();
   }
   
   public void clickLogoutBtn() {
	   logoutBtn.click();  
   }



   public String validateLoginErrorMsg(){
    return 	loginErrorMsg.getText();
}

public String validatePopUpWindow(){
	return 	cancelBtn.getText();
}
   }

