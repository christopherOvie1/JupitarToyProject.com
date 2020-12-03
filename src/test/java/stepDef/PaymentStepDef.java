package stepDef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import page.CartPage;
import page.PaymentPage;
import page.TransactionPage;

public class PaymentStepDef {

    private PaymentPage paymentPage;
    private CartPage cartPage;
    private TransactionPage transactionPage;
    public PaymentStepDef(){

        paymentPage= new PaymentPage();
        cartPage = new CartPage();
        transactionPage = new TransactionPage();
    }

    @And("^user clicks check out button$")
    public void userClicksCheckOutButton() {
        cartPage.clickCheckOutButton();

    }

    @And("^user enters the  contact details \"([^\"]*)\",\"([^\"]*)\"  and  \"([^\"]*)\"$")
    public void userEntersTheContactDetailsAnd(String forename, String email, String address) throws Throwable {
        paymentPage.enterContactDetails(forename,email,address);

    }

    @And("^user enters cardType \"([^\"]*)\" and \"([^\"]*)\"$")
    public void userEntersCardTypeAnd(String cardType, String cardNumber) throws Throwable {
        paymentPage.selectPaymentType(cardType,cardNumber);
    }

    @When("^user click the submit button$")
    public void userClickTheSubmitButton() {
        paymentPage.clickPaymentSubmitBtn();
    }

    @Then("^user validates  transaction is successful$")
    public void userValidatesTransactionIsSuccessful() throws InterruptedException {
        String actualMessage = transactionPage.validateTransactionFigure();
       System.out.println(actualMessage);
       Assert.assertTrue(actualMessage.startsWith("JT160"));
       Assert.assertTrue(actualMessage.length() == 15);



    }


}
