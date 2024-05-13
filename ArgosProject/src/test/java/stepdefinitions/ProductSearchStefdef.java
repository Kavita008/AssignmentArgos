package stepdefinitions;

import browsercontrol.WebConnector;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.ProductSearchPage;
import utilities.ConstantUtils;

public class ProductSearchStefdef extends WebConnector {
    ProductSearchPage page = new ProductSearchPage();

    @Given("the user navigate to the home page")
    public void the_user_navigate_to_the_home_page() {
        driver.get(ConstantUtils.BASE_URL);
       page.Setcookiesxpath();
    }

    @When("the  user click on search box")
    public void theUserClickOnSearchBox() {
        page.setSearchboXpath();
    }


    @Then("the user enter {string} in the search box")
    public void theUserEnterInTheSearchBox(String text) {
        page.searchproduct(text);

    }


    @And("the user click on search button")
    public void theUserClickOnSearchButton() {
        page.setSearchbuttonXpath();
    }
}

