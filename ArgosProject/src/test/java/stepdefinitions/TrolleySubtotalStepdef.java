package stepdefinitions;

import browsercontrol.WebConnector;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.TrolleySubtotalPage;

public class TrolleySubtotalStepdef extends WebConnector {
    TrolleySubtotalPage Page = new TrolleySubtotalPage();



    @And("the user click on the quantity box")
    public void theUserClickOnTheQuantityBox() {
        Page .setQuantityxpath();

    }


    @Then("the user should see {string} price on the page")
    public void theUserShouldSeePriceOnThePage(String string) {
        Page.setSubtotalxpath();

    }
}








