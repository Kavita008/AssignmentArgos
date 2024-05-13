package pageobjects;

import browsercontrol.WebConnector;

public class TrolleySubtotalPage extends WebConnector {

    /******************  locators   **********************/



    private String quantityxpath = "//select[@class='ProductCardstyles__QuantitySelect-sc-1g8w3q7-21 fpgWSD']";

    private String subtotalxpath = "//div[@class='Summarystyles__SubTotalLabel-sc-6y01-4 bwoEYA']";


    /*******************   getters & setters  ********************/


    public void setQuantityxpath (){
        BasePage.findElementByXpath( quantityxpath);
    }

    public void setSubtotalxpath(){
        BasePage.findElementByXpath(subtotalxpath);

    }



}


