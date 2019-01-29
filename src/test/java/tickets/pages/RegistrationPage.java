package tickets.pages;

import org.openqa.selenium.By;

public class RegistrationPage {
    private BaseFunc baseFunc;
    private final By NAME = By.id("name");
    private final By SURNAME = By.id("surname");
    private final By DISCOUNT = By.id("discount");
    private final By TRAVELER = By.id("adults");
    private final By CHILDREN = By.id("children");
    private final By LUGGAGE = By.id("bugs");
    private final By FLIGHT_DATE = By.id("flight");
    private final By BOOK_BTN = By.id("book2");

    public RegistrationPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void typeName(String name) {
        baseFunc.inputField(NAME, name);
    }

    public void typeSurname(String surname) {
        baseFunc.inputField(SURNAME, surname);
    }

    public void typeDiscount (String discount) {
        baseFunc.inputField(DISCOUNT, discount);
    }

    public void typeTravelerCount (String travelerCount) {
        baseFunc.inputField(TRAVELER, travelerCount);
    }

    public void typeChildrenCount (String childrenCount) {
        baseFunc.inputField(CHILDREN, childrenCount);
    }

    public void typeLuggageCount (String lugaggeCount) {
        baseFunc.inputField(LUGGAGE, lugaggeCount);
    }

    public void typeFlightDate (String flightDate) {
        baseFunc.selectByText(FLIGHT_DATE, flightDate);
    }

    public void submitUserForm() {
        baseFunc.click(BOOK_BTN);
    }
}

