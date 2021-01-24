package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BaseFunc {
    //-- UNIVERSAL VARIANT--
    private final Logger LOGGER = LogManager.getLogger(this.getClass());
    //----------------------
//    private final Logger LOGGER = LogManager.getLogger(BaseFunc.class);
    private WebDriver driver;
    private WebDriverWait wait;

    public BaseFunc(){
        LOGGER.info("Setting webdriver path");
        System.setProperty("webdriver.chrome.driver", "/Users/lena/Downloads/chromedriver");

        LOGGER.info("Opening browser window");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 10);
    }

    public void openUrl(String url) {
        LOGGER.info("Openning" + url + " web page");
        driver.get(url);
    }

    public void click(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        driver.findElement(locator).click();

    }

    public void click(WebElement we) {
        wait.until(ExpectedConditions.elementToBeClickable(we));
        we.click();

    }


    public List<WebElement> findElements (By locator) {
        LOGGER.info("Getting all element by: " + locator);
        return driver.findElements(locator);

    }
}
