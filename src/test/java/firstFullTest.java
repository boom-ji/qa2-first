import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class firstFullTest {
    //locator na vsju statju celikom
    private final By ARTICLE = By.tagName("article");
    private final By ARTICLE_TITLE = By.xpath(".//span[@itemprop = 'headline name']");
    private final By COMMENTS_COUNT = By.xpath(".//span[contains(@class, 'list-article__comment')]");

    private final By ARTICLE_PAGE_TITLE = By.xpath(".//h1[@itemprop = 'headline name']");
//    private final By ARTICLE_COMMENT_COUNT = By.xpath("");

    @Test
    public void titleCommentsCheck(){
        System.setProperty("webdriver.chrome.driver", "/Users/lena/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://tvnet.lv");

        //--the 1st step of automatization is test plan--

        //Find article
        WebElement currentArticle = driver.findElements(ARTICLE).get(7);

        //Store title (prisvaivaetsja element find element+zapominaet)nazvanie
        String titleToCheck = currentArticle.findElement(ARTICLE_TITLE).getText();

        //store comments count (for checking the name of article)
        int commentCount = 0;

        if (!currentArticle.findElements(COMMENTS_COUNT).isEmpty()) {
            String commentsToParse = currentArticle.findElement(COMMENTS_COUNT).getText(); //(36)
            commentsToParse = commentsToParse.substring(1,commentsToParse.length() - 1);  // (36) ->36
            commentCount = Integer.parseInt(commentsToParse); // perepisivaet znachenie elementov

        }

        // Open article
        currentArticle.findElement(ARTICLE_TITLE).click();

        WebDriverWait wait = new WebDriverWait(driver,100);
        wait.until(ExpectedConditions.visibilityOfElementLocated(ARTICLE_TITLE));



        //check title(article)
        Assertions.assertEquals(titleToCheck, driver.findElement(ARTICLE_PAGE_TITLE).getText(), "Incorrect Title!");

        //check comments
//        Assertions.assertEquals(commentCount, driver.findElement(COMMENTS_COUNT).getSize(), "wrong comments");

        //click on comments
//        WebElement currentComment = driver.findElement(By.name());

        //check title

        // check if there are comments
        //
        //
        //

    }



}
