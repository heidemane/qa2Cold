import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DelfiFirstTest {
    private  By ARTICLE_TITLE = By.xpath(".//a[@class = 'top2012-title']");//mainīgais ir konstants
    private Logger LOGGER = LogManager.getLogger(DelfiFirstTest.class);

    /**
     * This test will test first article title presents on page
     */
    @Test
    public void delfiFirstTitleTest() {
        LOGGER.info("We are starting our test");
        System.setProperty("webdriver.gecko.driver", "c:/geckodriver.exe");
        // Here we will write the code

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();

        LOGGER.info("We are opening Delfi home page");
        driver.get("http://www.delfi.lv");

        String articleToCheck = "'OlyBet' basketbola līga: LU - 'Kalev/Cramo'. Video tiešraide";

        WebElement article = driver.findElement(ARTICLE_TITLE);
        String articleText = article.getText();

        Assertions.assertEquals(articleToCheck, articleText, "Fatal Laura`s error!");
    }
}

