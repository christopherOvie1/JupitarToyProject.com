package page;

import base.TestBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class CartPage extends TestBase {

    public CartPage(){
        PageFactory.initElements(driver,this);
    }

    //object repositories

    @FindBy(how= How.XPATH,using ="//table/tbody/tr[1]/td[3]/input")
    private  WebElement quantityFirstBox;

    @FindBy(how= How.XPATH,using ="//table/tbody/tr[2]/td[3]/input")
    private  WebElement quantitySecondBox;

    @FindBy(how= How.XPATH,using ="//tfoot/tr/td/strong")
    WebElement price;

    @FindBy(how= How.XPATH,using ="//tbody//tr")
    private  WebElement ProductDiscriptionField;


    private By productName = By.xpath("//td[1]");
    private By productPrice = By.xpath("//td[2]");
    private By quantity = By.xpath("//td[3]/input");
    private By subTotal = By.xpath("//td[4]");
    private By actions = By.xpath("//td[5]");
    private By TotalPrice = By.xpath("//*[@class= 'total ng-binding']");
    private By checkoutBtn = By.xpath("//a[@ class= 'btn-checkout btn btn-success  ng-scope']");


    public static  String productName1;
    public static  String productName2;
    private  double productPrice1;
    private  double productPrice2;
    private double productsubTotal1;
    private  double productsubTotal2;
    private double allProductsTotalPrice;

    //page actions
    public void clickCheckOutButton(){
        driver.findElement(checkoutBtn).click();
    }

    public void captureProductPrices(String product1, String product2) throws InterruptedException {

        WebElement element = ProductDiscriptionField.findElements(productName).stream().filter(x->x.getText().toLowerCase().equals(product1.toLowerCase())).findFirst().get();
        productName1 = element.getText();
        productPrice1= Double.parseDouble(element.findElements(productPrice).get(0).getText().replace("$", ""));
         productsubTotal1 = Double.parseDouble(element.findElements(subTotal).get(0).getText().replace("$", ""));

         element = ProductDiscriptionField.findElements(productName).stream().filter(x->x.getText().toLowerCase().equals(product2.toLowerCase())).findFirst().get();
        productName2 = element.getText();
         productPrice2=   Double.parseDouble(element.findElements(productPrice).get(1).getText().replace("$", ""));
        productsubTotal2 = Double.parseDouble(element.findElements(subTotal).get(1).getText().replace("$",""));


        allProductsTotalPrice = Double.parseDouble(driver.findElement(TotalPrice).getText().replace("Total: ",""));

    }

    public boolean validateProductItemsAreCorrect(String Product1, String Product2)
    {
        return productName1.equalsIgnoreCase(Product1) && productName2.equalsIgnoreCase(Product2);
    }

    public void updateQuantity(int firstQuantity, int secondQuantity){
        quantityFirstBox.clear();
        quantityFirstBox.sendKeys(Integer.toString(firstQuantity));
        quantitySecondBox.clear();
        quantitySecondBox.sendKeys(Integer.toString(secondQuantity));
    }

    public boolean validateAllPricing(double Product1, double Product2, int Quantity1, int Quantity2)
    {
        boolean checkProductPrice = (productPrice1 == Product1 && productPrice2 == Product2);
        boolean checkSubTotal1 = Quantity1 * Product1 == productsubTotal1;
        boolean checkSubTotal2 = Quantity2 * Product2 == productsubTotal2;
        boolean checkTotalPrice = (Quantity1 * Product1 + Quantity2 * Product2) == allProductsTotalPrice;

        return (checkProductPrice && checkSubTotal1 && checkSubTotal2 && checkTotalPrice);
    }

}
