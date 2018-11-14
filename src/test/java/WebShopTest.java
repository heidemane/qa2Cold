import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class WebShopTest {

    private final String SHOP_PAGE = "http://automationpractice.com";
    private final By MENU_BTN = By.xpath(".//ul[@class = 'sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a");
    private final By CATALOG_CHECK_BOX = By.xpath(".//ul[@class = 'col-lg-12 layered_filter_ul']/li/label");
    private final By COLOR_FILTER = By.xpath(".//ul[@class = 'col-lg-12 layered_filter_ul color-group']/li/label");
    private final By LOADER = By.xpath(".//ul[@class = 'product_list grid row']/p");
    private final By LIST_VIEW_ICON = By.className("icon-th-list");

    @Test
    public void dressesTest() {

        System.setProperty("webdriver.chrome.driver", "/driver/chromedriver.exe");

        System.setProperty("webdriver.gecko.driver", "c:/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();

        driver.get(SHOP_PAGE);

        selectMenuItem("WOMEN");

        selectFilter("Dresses", CATALOG_CHECK_BOX);
        waitLoad();

        selectFilter("Orange", COLOR_FILTER);
        waitLoad();

        driver.findElement(LIST_VIEW_ICON).click();
    }

    private void selectMenuItem(String menuItem) {

        List<WebElement> menuItems = driver.findElement(MENU_BTN);

        for (int i = 0; i < menuItems.size(); i++) {
            if (menuItems.get(i).getText().equals(menuItem)) {
                menuItems.get(i).click();
            }
        }
    }

    private void selectFilter(String filterName, By locator) {

        List<WebElement> filterItems = driver.findElements(locator);

        for (WebElement filterItem : filterItems) {
            if (filterItem.getText().contains(filterName)) {
                filterItem.click();
                break;
            }
        }
    }

    private void waitLoad() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.invisibilityOfElementLocated(LOADER));
    }
}
}
