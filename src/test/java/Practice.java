import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Practice {
    //create article locator
    //create comment locator
    private final By ETHALON_TITLE = By.xpath(".//a[@class = 'top2012-title']");
    private final By ETHALON_COMMENT_COUNT = By.xpath(".//a[@class = 'comment-count']");
    private final By ETHALON_TITLE_COMMENT = By.xpath(".//h3[@class = 'top2012-title']");
    private final By ARTICLE_PAGE_TITLE = By.xpath(".//h1[@class = 'article-title']");
    private final By ARTICLE_PAGE_COMMENT = By.xpath(".//a[@class = 'comment-count']");
    private final By COMMENT_PAGE_TITLE = By.xpath(".//a[@class = 'comment-main-title-link']");
    private final By REGISTRED_COMMENT_COUNT = By.xpath(".//div[@id='comments-listing']/div/a[1]/span");
    private final By ANONYMOUS_COMMENT_COUNT = By.xpath(".//div[@id='comments-listing']/div/a[2]/span");

    @Test
    public void practice() {
        //open browser
        //open delfi
        System.setProperty("webdriver.gecko.driver", "c:/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://www.delfi.lv");
        //find main page article elements
        List<WebElement> articles = driver.findElements(ETHALON_TITLE_COMMENT);
        //find main page 3rd element
        WebElement thirdElement = articles.get(2);
        // get 3rd element article title
        String thirdArticle = thirdElement.findElement(ETHALON_TITLE).getText();
        //find 3rd element comment count
        String thirdElCommentCount = thirdElement.findElement(ETHALON_COMMENT_COUNT).getText();
        //cut comment brackets
        thirdElCommentCount = thirdElCommentCount.substring(1, thirdElCommentCount.length()-1);
        //convert comment count string to int
        int articleCommentCount = Integer.valueOf(thirdElCommentCount);
        //go to the 3rd article page
        thirdElement.findElement(ETHALON_TITLE).click();
        //create article page title locator DONE
        //create article page comments locator DONE
        //get article title
        String articlePageTitle = driver.findElement(ARTICLE_PAGE_TITLE).getText();
        //find comment count
        String articlePageComment = driver.findElement(ARTICLE_PAGE_COMMENT).getText();
        //cut comment brackets
        articlePageComment = articlePageComment.substring(1, articlePageComment.length()-1);
        //convert comment count string to int
        int articlePageCommentDigits = Integer.valueOf(articlePageComment);
        //check article titles with 1st page
        Assertions.assertEquals(thirdArticle, articlePageTitle, "Main page article is not equal to page article");
        //check comment counts
        Assertions.assertEquals(articleCommentCount, articlePageCommentDigits, "Main page comment count is not equal to article page comment count");
        //go to the comment page
        driver.findElement(ARTICLE_PAGE_COMMENT).click();
        //create comment pages title locator DONE
        //create registered users comment count locator DONE
        //create anonymous users comment count locator DONE
        //get comment pages title text
        String commentPageArticle = driver.findElement(COMMENT_PAGE_TITLE).getText();
        //check comment page title with main page title (e-talon :))
        Assertions.assertEquals(commentPageArticle, thirdArticle, "Coment page title and Article Page title are not equals");
        //find comment page registered users comment count
        String registredUsersCommentCount = driver.findElement(REGISTRED_COMMENT_COUNT).getText();
        //cut comment brackets
        registredUsersCommentCount = registredUsersCommentCount.substring(1, registredUsersCommentCount.length()-1);
        //convert comment count string to int
        int registredUsersComentCountInt = Integer.valueOf(registredUsersCommentCount);
        //find comment page anonymous users comment count
        String anonymousUsersCommentCount = driver.findElement(ANONYMOUS_COMMENT_COUNT).getText();
        //cut comment brackets
        anonymousUsersCommentCount = anonymousUsersCommentCount.substring(1, anonymousUsersCommentCount.length()-1);
        //convert comment count string to int
        int anonymousUserCommentCountInt = Integer.valueOf(anonymousUsersCommentCount);
        //sum anonymous and registered comments
        Integer totalComentPageCommentCount = anonymousUserCommentCountInt + registredUsersComentCountInt;
        //check sum of anonymous and registered comments count with main pages comments count funkcija- contains
        Assertions.assertEquals(totalComentPageCommentCount, articlePageComment, "Comment page comment count are net equal to main page comment count");
    }
}
