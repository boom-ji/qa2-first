import com.sun.xml.internal.ws.resources.UtilMessages;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class DelfiTests {
    private final By ACCEPT_COOKIES_BTN = By.xpath(".//button[@mode = 'primary']");
    private final By ARTICLE_TITLE = By.xpath(".//span[@itemprop = 'headline name']");


    @Test
    public void firstDelfiTest() {

        System.setProperty("webdriver.chrome.driver", "/Users/lena/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://delfi.lv");

        WebDriverWait wait = new WebDriverWait(driver,100);
        wait.until(ExpectedConditions.visibilityOfElementLocated(ACCEPT_COOKIES_BTN));


        WebElement acceptBtn = driver.findElement(ACCEPT_COOKIES_BTN);
        acceptBtn.click();


    }

    @Test
    public void tvnetTest() {
        String articleToOpen = "Lietuvā 2219 jauni koronavīrusa gadījumi, Igaunijā 479 ";

        System.setProperty("webdriver.chrome.driver", "/Users/lena/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://tvnet.lv");

        List<WebElement> articles = driver.findElements(ARTICLE_TITLE);
        System.out.println(articles.size());
        System.out.println(articles.isEmpty());
  //-----      System.out.println(articles.get(5).getText());
        System.out.println(articleToOpen);


// ------for------ counter start - till---step - (increment i++ => i = i + 1)
//        for (int i = 0; i < articles.size(); i++ ){
//            if (articles.get(i).getText().startsWith(articleToOpen)) {
//                articles.get(i).click();
//                break;
//
//            }
//
//        }



        //----- foeach----
        for (WebElement we : articles) {
            if (we.getText().startsWith(articleToOpen)){
                we.click();
                break;

        }
        }


    }




}
