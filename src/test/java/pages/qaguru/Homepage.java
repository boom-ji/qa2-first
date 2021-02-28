package pages.qaguru;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import pages.BaseFunc;


public class Homepage {
    private final By REGISTRATION_BTN = By.xpath(".//div[@class = 'cRegistrationBtn']");
    private final Logger LOGGER = LogManager.getLogger(this.getClass());
    private final BaseFunc baseFunc;

    public Homepage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public RegistrationPage openRegistrationPage() {
        LOGGER.info("Trying to open registration page");
        baseFunc.click(REGISTRATION_BTN);
        return new RegistrationPage(baseFunc);
    }
}
