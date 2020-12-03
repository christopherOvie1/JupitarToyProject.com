package page;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CommonPage extends TestBase {


    @FindBy(how= How.CSS,using ="#nav-cart > a")
    WebElement cartLink;
    public CommonPage(){
        PageFactory.initElements(driver,this);
    }

   public boolean validatePageURL(String pageName) {;
   return  driver.getCurrentUrl().endsWith(pageName);
   }

public boolean ValidateURL(String url) {

return driver.getCurrentUrl().equalsIgnoreCase(url);

}


public void clickCartLink(){
    cartLink.click();
}
}
