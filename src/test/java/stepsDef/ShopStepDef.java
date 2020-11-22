package stepsDef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import page.ShopPage;

public class ShopStepDef {

  private ShopPage shopPage;

  public ShopStepDef(){
      shopPage = new ShopPage();
  }

    @And("^user click shop link$")
    public void userClickShopLink() {
        shopPage.clickShoplink();
    }



    @When("^user made attempt to shop  by adding \"([^\"]*)\" and \"([^\"]*)\" to the cart$")
    public void userMadeAttemptToShopByAddingAndToTheCart(String product1, String product2) throws Throwable {
      shopPage.selectProduct(product1, product2);
     // shopPage.selectProduct(product2);
    }

    @When("^user click cart link$")
    public void userClickCartLink() {

    }

    @Then("^user confirms correct items are added to the cart$")
    public void userConfirmsCorrectItemsAreAddedToTheCart() {
    }

    @And("^user update the number of each item in the cart$")
    public void userUpdateTheNumberOfEachItemInTheCart() {
    }

    @And("^user confirms the price is reflected accuratly$")
    public void userConfirmsThePriceIsReflectedAccuratly() {
    }

    @When("^user click the checkout button$")
    public void userClickTheCheckoutButton() {
    }

  /*  @Then("^user should be in payment page$")
    public void userShouldBeInPaymentPage() {
    String shopUrl=  shopPage.validateShopPageTitle();
      System.out.println(shopUrl);
      Assert.assertTrue(shopPage.validateShopPageTitle().contains("https://jupiter.cloud.planittesting.com/#/shop"));
    }*/

    @And("^user attempts payment by entering \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" and \"([^\"]*)\"$")
    public void userAttemptsPaymentByEnteringAnd(String arg0, String arg1, String arg2, String arg3, String arg4) throws Throwable {

    }
    @When("^user click submit button on payment details page$")
    public void userClickSubmitButtonOnPaymentDetailsPage() {
    }

    @Then("^user  validate the successful message Thanks \"([^\"]*)\" , your order has been accepted\\. Your order nuumber is JT(\\d+)$")
    public void userValidateTheSuccessfulMessageThanksYourOrderHasBeenAcceptedYourOrderNuumberIsJT(String arg0, int arg1) throws Throwable {

    }

}
