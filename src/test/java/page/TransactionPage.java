package page;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import waits.MyWebDriverWait;

public class TransactionPage extends TestBase {

    @FindBy(how= How.XPATH,using ="//*[@class='alert alert-success']")
    WebElement transactionSuccessMessgae;

    @FindBy(how= How.XPATH,using ="//div[2]/div/div/strong[2]")
    WebElement paymentTransactionNumber;

    @FindBy(how = How.XPATH, using = "//a[@class='btn btn-success ']")
    WebElement shoppingAgainbtn;



    public TransactionPage(){
        PageFactory.initElements(driver,this);
    }

    public String validateSuccessfulTransactionMessage(){
      return  transactionSuccessMessgae.getText();
    }

    public String validateTransactionFigure(){
        MyWebDriverWait wait= new MyWebDriverWait();
        wait.waitForElementToBeVisible(shoppingAgainbtn ,30);
        return  paymentTransactionNumber.getText();
    }

}
