import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


import java.util.ArrayList;
import java.util.List;

public class HomeWorkDelfi {
    private final By ARTICLE_TITLE = By.xpath(".//a[@class = 'top2012-title']");
    private final By MOBILE_ARTICLE_TITLE = By.xpath(".//a[@class= 'md-scrollpos']");

    @Test
    public void homeWorkDelfi () {

        System.setProperty("webdriver.gecko.driver", "c:/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.delfi.lv");

        WebElement article = driver.findElement(ARTICLE_TITLE);
        List<String> pageOneValues = new ArrayList<String>();
        pageOneValues.add(article.getText());

        driver.get("http://m.delfi.lv/");

        WebElement mob_article = driver.findElement(MOBILE_ARTICLE_TITLE);
        Assertions.assertEquals(pageOneValues.get(0), mob_article.getText(), "DISASTER");

    }
}
