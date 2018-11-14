package lesson7.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage {
    private final By ARTICLE = By.xpath(".//h3[@class='top2012-title']");
    private final By TITLE = By.xpath(".//a[@class='top2012-title']");
    private final By COMMENTS = By.xpath(".//a[@class = 'comment-count']");
    private BaseFunc baseFunc;

    public HomePage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public WebElement getArtileById (int id) {
    return baseFunc.getElements(ARTICLE).get(id);
    }

    public String getTitleById(int id) {
        return getArtileById(id).findElement(TITLE).getText();
    }

    public Integer getCommentCountById(int id) {
        String comments = getArtileById(id).findElement(COMMENTS).getText();
        comments = comments.substring(1,comments.length()-1);
        return Integer.valueOf(comments);
    }

    public ArticlePage goToArticleById (int id) {
        getArtileById(id).click();
        return new ArticlePage(baseFunc);



    }
}

