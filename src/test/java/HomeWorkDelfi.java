import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.awt.*;
import java.util.ArrayList;

public class HomeWorkDelfi {

    private final By ARTICLE_TITLE = By.xpath(".//a[@class = 'top2012-title']");
    private final By MOBILE_ARTICLE_TITLE = By.xpath(".//a[@class= 'md-scrollpos']");

    @Test
    public void homeWorkDelfi() {
        System.setProperty("webdriver.gecko.driver", "c:/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://www.delfi.lv");
        WebElement article = driver.findElement(ARTICLE_TITLE);
        String articleText1 = article.getText();

        String articleText = article.getText();
        driver.manage().window().maximize();
        driver.get("http://m.delfi.lv");
        WebElement article = driver.findElement(MOBILE_ARTICLE_TITLE);
        String articleText2 = article.getText();

        Assertions.assertEquals(articleText1, articleText2, "Fatal Laura`s error!");


    }
}