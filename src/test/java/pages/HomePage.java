package pages;

import helpers.CommentsHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import sun.security.ssl.SSLLogger;

import java.util.logging.Logger;

public class HomePage {
    private final By ACCEPT_BTN = By.xpath(".//button[@mode = 'primary']");
    private final By TITLE = By.xpath(".//span[@itemprop = 'headline name']");
    private final By COMMENTS_COUNT = By.xpath(".//span[contains(@class, '__comment')]");
    private BaseFunc baseFunc;


    public  HomePage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void acceptCookies() { baseFunc.click(ACCEPT_BTN);
    }
    public ArticlePage openArticleById(int id) {
        WebElement articleToClick = baseFunc.findElements(TITLE).get(id);
        baseFunc.click(articleToClick);
        return new ArticlePage(baseFunc);
    }

    public String getArticleById(int id) {
        Logger.info("Getting article Nr." + id + " title");

        return baseFunc.getText(TITLE, id);
    }

    public int getCommentCountById() {
        CommentsHelper helper = new CommentsHelper();
        return helper.getCommentCount(baseFunc.findElement(COMMENTS_COUNT));

    }
}
