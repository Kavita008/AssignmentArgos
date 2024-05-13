package pageobjects;

import browsercontrol.WebConnector;

public class SelectProductPage extends WebConnector {

    /***********************    locators    ********************/
    private String addtotrolleyxpath = "//button[@class='Buttonstyles__Button-sc-42scm2-2 kHHohd btn-cta']";


    private String gototrolleyxpath = "//a[@class='Buttonstyles__Button-sc-42scm2-2 iRZNRI']";


    /*******************     getters & setters  ******************/


    public void setAddtotrolleyxpath() {
        BasePage.findElementByXpath(addtotrolleyxpath).click();



        }

    public void setGototrolleyxpath() {
        BasePage.findElementByXpath(gototrolleyxpath).click();


    }


}


