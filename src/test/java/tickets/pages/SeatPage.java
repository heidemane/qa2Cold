package tickets.pages;

import org.openqa.selenium.By;

public class SeatPage {
    private BaseFunc baseFunc;
    private final By SEATS = By.id("seats");

    public SeatPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }
}
