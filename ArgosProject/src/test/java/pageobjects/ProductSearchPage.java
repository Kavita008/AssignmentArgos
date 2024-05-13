package pageobjects;

import browsercontrol.WebConnector;

public class ProductSearchPage extends WebConnector {




    /*****************   locators   ******************/

    private String searchboXpath = "//input[@id='searchTerm']";

    private String cookiesxpath = "//button[@id='explicit-consent-prompt-accept']";



    private String searchbuttonXpath = "//button[@data-test='search-button']";


    /*******************   Getters & Setters **************/

    public void setSearchboXpath () {
        BasePage.findElementByXpath(searchboXpath).click();
    }

    public void Setcookiesxpath() {
        BasePage.findElementByXpath(cookiesxpath).click();
    }

    public void searchproduct(String product) {
        BasePage.findElementByXpath(searchboXpath).sendKeys(product);

    }

    public void setSearchbuttonXpath () {
                BasePage.findElementByXpath(searchbuttonXpath).click();
            }


            }

