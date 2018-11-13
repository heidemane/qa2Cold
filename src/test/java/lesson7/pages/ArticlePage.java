package lesson7.pages;

import org.openqa.selenium.By;

public class ArticlePage {
    private final By TITLE = By.xpath(".//h1[contains(@class, 'd-inline')]");
    private final By COMMENTS = By.xpath(".//a[contains(@class, 'text-size-19')]");
    private BaseFunc baseFunc;

    public ArticlePage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;

    }

    public String getTitle() {
        return baseFunc.getElement(TITLE).getText();
    }

    public Integer getCommentCount() {

    }
}
