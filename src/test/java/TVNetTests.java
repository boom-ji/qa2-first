import com.sun.codemodel.internal.JCommentPart;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TVNetTests {
    private final By ACCEPT_TvNET_COOKIES_BTN = By.xpath(".//button[@class = 'notification__button']");
    private final By FIND_ANY_ARTICLE_LINK = By.xpath(".//a[@class = 'list-article__url']");
    private final By COMMENT_BTN = By.xpath(".//img[@src = '/v5/img/icons/comment-v2.svg']");


    @Test
    public void firstTVNetTest() {

        System.setProperty("webdriver.chrome.driver", "/Users/lena/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://tvnet.lv");

        WebElement acceptBtn = driver.findElement(ACCEPT_TvNET_COOKIES_BTN);
        acceptBtn.click();



        WebElement acceptLnk = driver.findElement(FIND_ANY_ARTICLE_LINK);
        acceptLnk.click();

        WebElement acceptCmnt = driver.findElement(COMMENT_BTN);
        acceptCmnt.click();



    }





}
