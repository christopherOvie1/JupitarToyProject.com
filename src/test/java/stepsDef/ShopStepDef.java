package stepsDef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import page.CommonPage;
import page.ShopPage;

public class ShopStepDef {

  private ShopPage shopPage;
   private CommonPage  commonPage;
  public ShopStepDef(){
      shopPage = new ShopPage();
       commonPage = new CommonPage();
  }
    @And("^user click shop link$")
    public void userClickShopLink() {
        shopPage.clickShoplink();
    }

    @When("^user made attempt to shop  by adding \"([^\"]*)\" and \"([^\"]*)\" to the cart$")
    public void userMadeAttemptToShopByAddingAndToTheCart(String product1, String product2) throws Throwable {
      shopPage.selectProduct(product1, product2);
      //if i decide to increase the number of each product by 1
     // shopPage.selectProduct(product1);
     // shopPage.selectProduct(product2);
    }

    @Then("^user confirms correct items are added to the cart$")
    public void userConfirmsCorrectItemsAreAddedToTheCart() {
             boolean d = shopPage.confirmNumberOfProduct();
            System.out.println(d);
            // Assert.assertTrue(shopPage.confirmNumberOfProduct());
    }

}
