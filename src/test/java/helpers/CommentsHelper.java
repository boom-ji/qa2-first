package helpers;

import org.openqa.selenium.WebElement;

public class CommentsHelper {
    public int getCommentCount(WebElement element) {
        String textToParse = element.getText();
        String commentsCount = textToParse.substring(1, textToParse.length() - 1); // ->66
        return Integer.parseInt(commentsCount); //peredelivaem string v int

    }

}
