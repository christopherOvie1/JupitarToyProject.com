package page;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactPage extends TestBase{

    @FindBy(how= How.XPATH,using ="//a[contains(text(),'Contact')]")
    WebElement contactlink;

    @FindBy(how= How.ID,using ="forename")
    WebElement forenameTxtField;

    @FindBy(how= How.ID,using ="email")
    WebElement emailTxtField;

    @FindBy(how= How.ID,using ="message")
    WebElement messageTxtField;

    @FindBy(how= How.CSS,using ="body > div.container-fluid > div > form > div > a")
    WebElement messageSubmitBtn;

    @FindBy(how= How.CSS,using ="body > div.container-fluid > div > a")
    WebElement backButton;

    @FindBy(how= How.ID,using ="forename-err")
   WebElement forenameRequiredErrorMsg;

    @FindBy(how= How.ID,using ="email-err")
    WebElement emailRequiredErrorMsg;

    @FindBy(how= How.ID,using ="message-err")
    WebElement messageRequiredErrorMsg;

    @FindBy(how= How.CSS,using ="body > div.container-fluid > div > div")
    WebElement successMessageTxt;

    public ContactPage(){
        PageFactory.initElements(driver, this);
    }

    public void clickContactLink(){
        contactlink.click();
    }

    public void enterMandatoryDetails(String  forename,String email, String message){
        forenameTxtField.sendKeys(forename);
        emailTxtField.sendKeys(email);
        messageTxtField.sendKeys(message);
    }
    public void clickMessageSubmitBtn(){
        messageSubmitBtn.click();
    }
    public String confirmContactPageBackButton(){
        WebDriverWait  wait = new WebDriverWait(driver, 40);
        WebElement element = wait.until(ExpectedConditions.visibilityOf(backButton));
        return backButton.getText();
    }

    public String validateSuccessMessageTxt(){
       return successMessageTxt.getText();

    }
}
