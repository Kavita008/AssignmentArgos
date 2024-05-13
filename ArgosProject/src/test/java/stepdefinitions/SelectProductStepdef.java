package stepdefinitions;

import browsercontrol.WebConnector;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pageobjects.SelectProductPage;

public class SelectProductStepdef extends WebConnector {
    SelectProductPage ProductPage = new SelectProductPage();



    @Then("user should see {string} in the page")
    public void userShouldSeeInThePage(String Expecteditem) {
        Assert.assertTrue(driver.getPageSource().contains(Expecteditem));


    }

    @And("the user add Habitat Wooden Folding Chair - Light Wood to the cart")
    public void theUserAddHabitatWoodenFoldingChairLightWoodToTheCart() {
        ProductPage.setAddtotrolleyxpath();
    }

    @And("the user click on go to trolley")
    public void theUserClickOnGoToTrolley() {
        ProductPage.setGototrolleyxpath();

    }



}


