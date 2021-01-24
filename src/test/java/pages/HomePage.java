package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage {
    private final By ACCEPT_BTN = By.xpath(".//div[contains(@class, 'button cookie')]");
    private final By TITLE = By.xpath(".//span[@itemprop = 'headline name']");
    private BaseFunc baseFunc;

    public  HomePage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }
    public void acceptCookies() {
        baseFunc.click(ACCEPT_BTN);
    }
    public void openArticleById(int id) {
        WebElement articleToClick = baseFunc.findElements(TITLE).get(id);
        baseFunc.click(articleToClick);
    }
}
