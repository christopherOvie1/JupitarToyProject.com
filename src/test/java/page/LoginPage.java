package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginPage extends TestBase{
	
	//object repositories
	@FindBy(how=How.LINK_TEXT,using ="Login")
	WebElement loginLink;
	
	@FindBy(how=How.ID,using ="loginUserName")
	WebElement usernameTxtField;
	
	@FindBy(how=How.ID,using ="loginPassword")
	WebElement passwordTxtField;
	
	@FindBy(how=How.XPATH,using ="//button[@type='submit']")
	WebElement loginSubmitBtn;
	
	@FindBy(how=How.CSS,using ="#nav-user > a > span")
	WebElement userNameLabel;
	
	@FindBy(how=How.CSS,using ="#nav-logout > a > span")
	WebElement logoutLink;
	
	@FindBy(how=How.CSS,using ="body > div.popup.modal.hide.ng-scope.in > div.modal-footer > a.btn.btn-success")
	WebElement logoutBtn;
	
	//page actions
	public LoginPage() {
	PageFactory.initElements(driver, this);
	}
	
   public void clickLoginLink() {
	loginLink.click();
    }

   public void loginIntoApp(String username, String password){
	usernameTxtField.sendKeys(username);
	passwordTxtField.sendKeys(password);
	loginSubmitBtn.click();
	
   }
 
   public String validateCorrectUserName() {
	return  userNameLabel.getText();
   }
   
   public void clickLogoutLink() {
	   logoutLink.click();
   }
   
   public void clickLogoutBtn() {
	   logoutBtn.click();  
   }
   }