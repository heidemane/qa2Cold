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
//    //private final By MOBILE_ARTICLE_TITLE = By.xpath(".//a[@class= 'md-scrollpos']");
@Test
public void homeWorkDelfi () {
    System.setProperty("webdriver.gecko.driver", "c:/geckodriver.exe");
    WebDriver driver = new FirefoxDriver();
    driver.manage().window().maximize();
    driver.get("http://www.delfi.lv");

    WebElement article = driver.findElement(ARTICLE_TITLE);

        List<String> webDelfiarticles = new ArrayList<String>();

        webDelfiarticles.add("5G tīkls Latvijā: kas to būvēs un kas par to maksās ");
        webDelfiarticles.add("Bordāns sola panākt ZZS atstāšanu opozīcijā");
        webDelfiarticles.add("'Lielais Kristaps 2018'. Balso par labākajām pašmāju filmām!");
        webDelfiarticles.add("Izstāšanās no Līguma par raķešu likvidāciju ir bezatbildīga, uzskata Gorbačovs");
        webDelfiarticles.add("Kas ir 'Tropu Tramps' Bolsonaru: 5 provokatīvas atziņas un plāni");

        List<WebElement> articles = driver.findElements(ARTICLE_TITLE);


        for (int i = 0; i < 5; i++) {
            Assertions.assertEquals(webDelfiarticles.get(i), articles.get(i).getText(), "Title Nr." + (i+1) + "is not correct");

//        pageOneValues.add(article.getText());
//
//        driver.get("http://m.delfi.lv/");
//
//        WebElement mob_article = driver.findElement(MOBILE_ARTICLE_TITLE);
//        Assertions.assertEquals(pageOneValues.get(0), mob_article.getText(), "DISASTER");
//
}
}}