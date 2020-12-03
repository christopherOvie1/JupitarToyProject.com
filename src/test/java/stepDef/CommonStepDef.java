package stepDef;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import page.CommonPage;

public class CommonStepDef {
    private CommonPage commonPage;

    public CommonStepDef(){
        commonPage = new CommonPage();
    }


    @Then("^user is taken to \"([^\"]*)\"$")
    public void userIsTakenTo(String url)  {
        Assert.assertTrue(commonPage.validatePageURL(url));
    }

    @And("^user click cart link$")
    public void userClickCartLink() {
        commonPage.clickCartLink();
    }

    @Then("^user is taken to \"([^\"]*)\" page$")
    public void userIsTakenToPage(String url){
        Assert.assertTrue(commonPage.validatePageURL(url));
    }


}
