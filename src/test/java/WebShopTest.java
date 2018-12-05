import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.util.List;

public class WebShopTest {

    private final String SHOP_PAGE = "http://automationpractice.com";
    private final By WOMEN_BTN = By.xpath("//a[@title = 'Women']");
    private final By DRESSES_CHECK_BOX = By.xpath(".//label[@for= 'layered_category_8']");
    private final By ORANGE_COLOR_FILTER = By.xpath(".//label[@for= 'layered_id_attribute_group_13']");
    private final By FILTERS_SELECTED = By.xpath(".//div[@id = 'enabled_filters']");
    private final By LOADER = By.xpath(".//ul[@class = 'product_list grid row']/p");
    private final By LIST_VIEW_ICON = By.className("icon-th-list");

    @Test
    public void webShopTestTest() {

        System.setProperty("webdriver.chrome.driver", "/driver/chromedriver.exe");

        System.setProperty("webdriver.gecko.driver", "c:/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();

        driver.get(SHOP_PAGE);
        driver.findElement(WOMEN_BTN).click();

        driver.findElement(DRESSES_CHECK_BOX).click();

        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(FILTERS_SELECTED));

        driver.findElement(ORANGE_COLOR_FILTER).click();




//
//
//        driver.findElement(LIST_VIEW_ICON).click();
//    }
//
//    private void selectMenuItem(String menuItem) {
//
//        List<WebElement> menuItems = driver.findElement(MENU_BTN);
//
//        for (int i = 0; i < menuItems.size(); i++) {
//            if (menuItems.get(i).getText().equals(menuItem)) {
//                menuItems.get(i).click();
//            }
//        }
//    }
//
//    private void selectFilter(String filterName, By locator) {
//
//        List<WebElement> filterItems = driver.findElements(locator);
//
//        for (WebElement filterItem : filterItems) {
//            if (filterItem.getText().contains(filterName)) {
//                filterItem.click();
//                break;
//            }
//        }
//    }
//
//    private void waitLoad() {
//        new WebDriverWait(driver, 10).until(ExpectedConditions.invisibilityOfElementLocated(LOADER));
//    }
}
}
