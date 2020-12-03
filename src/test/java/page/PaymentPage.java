package page;

import base.TestBase;
import cucumber.api.java.en.And;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class PaymentPage  extends TestBase {

    @FindBy(how= How.XPATH,using ="//a[contains(text(),'Check Out')]")
    WebElement checkoutBtn;

    @FindBy(how= How.ID,using ="checkout-submit-btn")
    WebElement paymentSubmitBtn;

    @FindBy(how= How.ID,using ="cardType")
    WebElement cardDropdown;

    @FindBy(how= How.ID,using ="card")
    WebElement cardNumberField;

    @FindBy(how= How.ID,using ="forename")
    WebElement forenameTxtField;

    @FindBy(how= How.ID,using ="email")
    WebElement emailTxtField;

    @FindBy(how= How.ID,using ="address")
    WebElement addressTxtField;
    public PaymentPage(){
        PageFactory.initElements(driver,this);
    }

    //page actions
    public void clickCheckOutButton(){
        checkoutBtn.click();
    }

    public void enterContactDetails(String forename,String email, String address){
        forenameTxtField.sendKeys(forename);
        emailTxtField.sendKeys(email);
        addressTxtField.sendKeys(address);
    }

    public void  selectPaymentType(String cardType,String cardNumber){
        Select c = new Select(cardDropdown);
        c.selectByVisibleText(cardType);
        cardNumberField.sendKeys(cardNumber);
    }
public void clickPaymentSubmitBtn(){
    paymentSubmitBtn.click();
}

}
