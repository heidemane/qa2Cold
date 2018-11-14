package barbora.pages;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.firefox.FirefoxDriver;

        import java.util.List;

public class BaseFunc {
    WebDriver driver;

    public BaseFunc() {
        System.setProperty("webdriver.gecko.driver", "c:/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    public void openPage (String url){
        driver.get(url);
    }

    public List<WebElement> getElements(By locator){
        return driver.findElements(locator);
    }
    public WebElement getElement (By locator){
        return driver.findElement(locator);
    }
}

