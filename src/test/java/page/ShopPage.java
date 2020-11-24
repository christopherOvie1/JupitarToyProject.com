package page;

import base.TestBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.stream.Collectors;

public class ShopPage extends TestBase{
    @FindBy(how= How.LINK_TEXT,using ="Shop")
    WebElement shopLink;

 // @FindBy(how = How.XPATH, using = "//div[@class='products ng-scope']/ul/li")
 @FindBy(how = How.XPATH, using = "//div[@class='products ng-scope']/ul/li")
  private List<WebElement> allProducts;

    private By productName = By.tagName("h4");
    private By productPrice = By.tagName("span");
    private By productBuyBtn = By.tagName("a");
    private String productSinglePrice;
    private String productPrice1;
    private String productPrice2;

    @FindBy(how= How.CSS,using ="#nav-cart > a > span")
    WebElement numberOfItemsReflected;

    public ShopPage(){
        PageFactory.initElements(driver,this);
    }
    public void clickShoplink(){
        shopLink.click();
    }

    public void selectProduct(String product){
      //  allProducts.stream().map(s->s.getText()).collect(Collectors.toList())// allProducts.get(0).getText()
      //  System.out.println(allProducts.get(4).getText());
        WebElement element = allProducts.stream().filter(x->x.findElement(productName).getText().toLowerCase().equals(product.toLowerCase())).findFirst().get();
        element.findElement(productBuyBtn).click();
        productSinglePrice = element.findElement(productPrice).getText();
    }

    public boolean confirmNumberOfProduct(){
      return  numberOfItemsReflected.isDisplayed();
    }
    public void selectProduct(String product1, String product2) throws Exception {
        //  allProducts.stream().map(s->s.getText()).collect(Collectors.toList())// allProducts.get(0).getText()
        //  System.out.println(allProducts.get(4).getText());

      //  try {
            WebElement element = allProducts.stream().filter(x->x.findElement(productName).getText().toLowerCase().equals(product1.toLowerCase())).findFirst().get();
            element.findElement(productBuyBtn).click();
            productPrice1 = element.findElement(productPrice).getText();

            element = allProducts.stream().filter(x->x.findElement(productName).getText().toLowerCase().equals(product2.toLowerCase())).findFirst().get();
            element.findElement(productBuyBtn).click();
            productPrice2 = element.findElement(productPrice).getText();
            System.out.println(productPrice1 );
            System.out.println( productPrice2);
//        }catch (Exception e)
//        {
//            throw new Exception("There was a problem finding the product1 :" + product1 + "due to :" + e.getMessage());
//        }

    }
}
