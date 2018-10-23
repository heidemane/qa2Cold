import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class DelfiMobileWebArticleCheck {

    private final By webArticles = By.xpath(".//a[@class='top2012-title']");
    private final By mobArticles = By.xpath(".//a[@class='md-scrollpos']");

@Test
    public void delfiMobileWebArticleCheck (){

    System.setProperty("webdriver.gecko.driver", "c:/geckodriver.exe");
    WebDriver driver = new FirefoxDriver();
    driver.manage().window().maximize();
    driver.get("http://www.delfi.lv");

    List<WebElement> webArticlesToCheck = driver.findElements(webArticles);

    driver.get("http://m.delfi.lv/");
    List<WebElement> mobArticlesToCheck = driver.findElements(mobArticles);

    }
}
