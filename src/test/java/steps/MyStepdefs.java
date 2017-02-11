package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by Raj on 2/10/17.
 */
public class MyStepdefs {
    @When("^I enter username and password$")
    public void iEnterUsernameAndPassword() {
        System.out.println("iEnterUsernameAndPassword");
    }

    @And("^Click on logon button$")
    public void clickOnLogonButton() {
        System.out.println("clickOnLogonButton");
    }

    @Then("^I should see home page$")
    public void iShouldSeeHomePage()  {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("iShouldSeeHomePage");
    }
}
