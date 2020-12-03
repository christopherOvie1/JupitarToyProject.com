package stepDef;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.junit.Assert;
import page.CartPage;
import page.ShopPage;

public class CartStepDef {

    private CartPage cartPage;
    private ShopPage shopPage;

    public CartStepDef(){
               cartPage = new CartPage();
    }
    @And("^user validates  \"([^\"]*)\" and \"([^\"]*)\"  are present the cart$")
    public void userValidatesAndArePresentTheCart(String product1, String product2) throws Throwable {
       cartPage.captureProductPrices(product1, product2);
      Assert.assertTrue(cartPage.validateProductItemsAreCorrect(product1,product2));

    }

    @And("^user updates the products \"([^\"]*)\" and \"([^\"]*)\" respectively$")
    public void userUpdatesTheProductsAndRespectively(int Quantity1, int Quantity2) throws Throwable {
        cartPage.updateQuantity(Quantity1,Quantity2);
        cartPage.captureProductPrices(cartPage.productName1,cartPage.productName2);
        Assert.assertTrue(cartPage.validateAllPricing(ShopPage.productPrice1,ShopPage.productPrice2,Quantity1,Quantity2));
    }
}
