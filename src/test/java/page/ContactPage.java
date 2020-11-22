package page;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import waits.MyWebDriverWait;

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

    @FindBy(how= How.CSS,using ="#header-message > div")
    WebElement feebbackErrorMessage;

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
    public void confirmContactPageBackButton(){
        MyWebDriverWait wait= new MyWebDriverWait();
        wait.waitForElementToBeVisible(backButton ,30);

    }
    public String validateSuccessMessageTxt(){
       return successMessageTxt.getText();
    }
    public  String validateFeebbackErrorMessage(){
      return   feebbackErrorMessage.getText();
    }

    public String validateforenameErrorMsg(){
   return forenameRequiredErrorMsg.getText();
    }

    public String validateEmailErrorMsg()
    {
       return emailRequiredErrorMsg.getText();
    }

    public String validateMessageErrorMsg(){
        return messageRequiredErrorMsg.getText();
    }
}
