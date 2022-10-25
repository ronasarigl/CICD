package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.account.GetAccount;

public class GetStepDefinitions {
    @Steps
    GetAccount getAccount;
    @Given("I set invalid UserId")
    public void iSetInvalidUserId() {
        getAccount.setInvalidUserId();
    }

    @When("I request get account")
    public void iRequestGetAccount() {
        getAccount.requestGetAccount();
    }

    @Then("I will get 401")
    public void iWillGet401() {
        getAccount.validateStatusCode();
    }

    @And("get User not authorized! message")
    public void getUserNotAuthorizedMessage() {
        getAccount.validateStatusCode();
    }
}
