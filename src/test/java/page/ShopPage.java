package page;

import base.TestBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.*;


public class ShopPage extends TestBase{
    @FindBy(how= How.LINK_TEXT,using ="Shop")
    WebElement shopLink;

    @FindBy(how= How.CSS,using ="#nav-cart > a > span")
    WebElement numberOfItemsReflected;

 @FindBy(how = How.XPATH, using = "//div[@class='products ng-scope']/ul/li")
  private List<WebElement> allProducts;

    private By productName = By.tagName("h4");
    private By productPrice = By.tagName("span");
    private By productBuyBtn = By.tagName("a");
   private String productSinglePrice;
    public static double productPrice1;
    public static double productPrice2;

    public ShopPage(){
        PageFactory.initElements(driver,this);
    }
    //page actions
    public void clickShoplink(){
        shopLink.click();
    }

    public void selectProduct(String product){
        WebElement element = allProducts.stream().filter(x->x.findElement(productName).getText().toLowerCase().equals(product.toLowerCase())).findFirst().get();
        element.findElement(productBuyBtn).click();
        productSinglePrice = element.findElement(productPrice).getText();
    }

   public String confirmNumberOfProduct(){
     return numberOfItemsReflected.getText();
   }
    public void selectProduct(String product1, String product2) throws Exception {


            WebElement element = allProducts.stream().filter(x->x.findElement(productName).getText().toLowerCase().equals(product1.toLowerCase())).findFirst().get();

            element.findElement(productBuyBtn).click();

            productPrice1 = Double.parseDouble(element.findElement(productPrice).getText().replace("$",""));

            element = allProducts.stream().filter(x->x.findElement(productName).getText().toLowerCase().equals(product2.toLowerCase())).findFirst().get();
            element.findElement(productBuyBtn).click();
            productPrice2 = Double.parseDouble(element.findElement(productPrice).getText().replace("$",""));

    }


}
