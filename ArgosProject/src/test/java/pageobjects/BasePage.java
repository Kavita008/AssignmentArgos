package pageobjects;

import browsercontrol.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage extends WebConnector {

    /***
     * Method to find and return the element using given Xpath
     *
     * @param xpath - xpath of the element
     * @return
     */


    public static WebElement findElementByXpath(String xpath) {
        return new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
    }



}

