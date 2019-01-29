package tickets.pages;

import org.openqa.selenium.By;

public class HomePage {
    private BaseFunc baseFunc;
    private final By ARRIVAL = By.id("afrom");
    private final By DEPARTURE = By.id("bfrom");
    private final By GOGOGO_BTN = By.xpath(".//span[@class = 'gogogo']");

    public HomePage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void selectDestinations(String from, String to) {
        baseFunc.selectByText(ARRIVAL, from);
        baseFunc.selectByText(DEPARTURE, to);
    }

    public void submitForm() {
        baseFunc.click(GOGOGO_BTN);
    }
}
