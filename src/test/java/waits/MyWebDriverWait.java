package waits;

import base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyWebDriverWait extends TestBase {

       WebDriverWait wait;

    public  void waitForElementToBeVisible(WebElement element, int Time){
        wait= new WebDriverWait(driver,Time);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

   /* public  void waitForURL(String url, int Time){
        wait= new WebDriverWait(driver,Time);
        wait.until(ExpectedConditions.urlContains(url));
    }*/
}
