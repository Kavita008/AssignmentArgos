package browsercontrol;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import utilities.ConstantUtils;

public class WebConnector {

    public static WebDriver driver;

    public static void openBrowser() {
        if (ConstantUtils.BROWSER_NAME.equalsIgnoreCase("firefox")) {
            FirefoxOptions fo = new FirefoxOptions();
            if (ConstantUtils.BROWSER_TYPE.equalsIgnoreCase("headless")) {
                fo.addArguments("--headless");

            }
        } else {
            ChromeOptions co = new ChromeOptions();
            if (ConstantUtils.BROWSER_TYPE.equalsIgnoreCase("headless")) {
                co.addArguments("--headless");

            }
            co.addArguments("start-maximized");
            driver = new ChromeDriver(co);
        }
    }

    public static void closeBrowser() {
        driver.quit();
    }

}

