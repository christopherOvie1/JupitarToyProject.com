package stepDef;








import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import page.ContactPage;


public class ContactStepDef {

    private ContactPage contactPage;


    public ContactStepDef() {
        contactPage  = new ContactPage();
    }

    @When("^user clicks on  contact link$")
    public void userClicksOnContactLink() {
        contactPage.clickContactLink();
    }

    @And("^user enters the  mandatory details \"([^\"]*)\",\"([^\"]*)\"  and  \"([^\"]*)\"$")
    public void userEntersTheMandatoryDetailsAnd(String forename, String email, String message)  {
        contactPage.enterMandatoryDetails(forename,email,message);
    }
    @When("^user click on submit button$")
    public void userClickOnSubmitButton() throws InterruptedException {
        contactPage.clickMessageSubmitBtn();
    }

    @Then("^user \"([^\"]*)\" should validate see successMessage$")
    public void userShouldValidateSeeSuccessMessage(String name) throws Throwable {
        Assert.assertEquals("Thanks "+name+", we appreciate your feedback.", contactPage.validateSuccessMessageTxt());
    }

    @Then("^user should be on contact page$")
    public void userShouldBeOnContactPage() {
        contactPage.confirmContactPageBackButton();
    }

    @And("^user also validate the feedback error warning error message \"([^\"]*)\"$")
    public void userAlsoValidateTheFeedbackErrorWarningErrorMessage(String expectedFeedbackMessage)  {
      String  actualFeebbackMessage = contactPage.validateFeebbackErrorMessage();
        System.out.println(actualFeebbackMessage);
        Assert.assertEquals(expectedFeedbackMessage,actualFeebbackMessage);
    }

    @Then("^user should validate the following error messages  as  \"([^\"]*)\"  , \"([^\"]*)\" and \"([^\"]*)\"$")
    public void userShouldValidateTheFollowingErrorMessagesAsAnd(String forename, String email, String message)  {
        System.out.println(contactPage.validateforenameErrorMsg());
        Assert.assertEquals(forename,contactPage.validateforenameErrorMsg());
        System.out.println( contactPage.validateEmailErrorMsg());
        Assert.assertEquals(email,contactPage.validateEmailErrorMsg());
       System.out.println( contactPage.validateMessageErrorMsg());
        Assert.assertEquals(message,contactPage.validateMessageErrorMsg());

    }


}
