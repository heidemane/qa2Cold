import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Find5Elements {
    private final By ARTICLE_TITLE = By.xpath(".//a[@class = 'top2012-title']");
    @Test
    public void find5element() {
        //Set up given titles to check
        List<String> givenArticles = new ArrayList<String>();
        givenArticles.add("Esam spēruši platu soli, lai Latvijā varētu izveidot valdību, lepojas 'Attīstībai/Par!'");
        givenArticles.add("'OlyBet' basketbol līga: 'Ogre' - 'Jēkabpils/SMScredit.lv'. Video tiešraide");
        givenArticles.add("JKP piedāvātais modelis vairs nav iespējams, norāda Dzintars");
        givenArticles.add("Slaktiņu Krimas koledžā sarīkojis tās audzēknis");
        givenArticles.add("Mūžībā devies mūziķis un LTV raidījuma vadītājs Valters Frīdenbergs");

        System.setProperty("webdriver.gecko.driver", "c:/geckodriver.exe");
        // Here we will write the code
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://www.delfi.lv");


        //Find 5 elements
        List<WebElement> articles = driver.findElements(ARTICLE_TITLE);
        //Pārbaude
        for (int i = 0; i < 5; i++) {
            Assertions.assertEquals(givenArticles.get(i), articles.get(i).getText(), "Title Nr." + (i+1) + "is not correct");
        }
    }
}
