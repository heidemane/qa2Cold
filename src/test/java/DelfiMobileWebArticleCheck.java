import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.List;

public class DelfiMobileWebArticleCheck {

    private final By WEBARTICLES = By.xpath(".//a[@class='top2012-title']");
    private final By MOBARTICLES = By.xpath(".//a[@class='md-scrollpos']");

    @Test
    public void delfiMobileWebArticleCheck() {

        System.setProperty("webdriver.gecko.driver", "c:/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://www.delfi.lv");

        List<WebElement> webArticlesToCheck = driver.findElements(WEBARTICLES);
        List<String> webArticles = new ArrayList<String>();

        for (int i = 0; i < 5; i++) {
            String articleText = webArticlesToCheck.get(i).getText();
            webArticles.add(articleText);
        }

        driver.get("http://m.delfi.lv/");
        List<WebElement> mobArticlesToCheck = driver.findElements(MOBARTICLES);
        List<String> mobArticles = new ArrayList<String>();

        for (int i = 0; i < 5; i++) {

            String mobarticleText = mobArticlesToCheck.get(i).getText();
            mobArticles.add(mobarticleText);
        }

        Assertions.assertEquals(webArticles, mobArticles, "Mismach");
    }
}
