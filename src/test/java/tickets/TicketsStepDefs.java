package tickets;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tickets.pages.BaseFunc;
import tickets.pages.HomePage;
import tickets.pages.RegistrationPage;
import tickets.pages.SeatPage;

import java.util.Map;

public class TicketsStepDefs {
    private String departureCity;
    private String arrivalCity;
    private String flightDate;
    private Map<String, String> params;
    private Integer seatNr;
    private BaseFunc baseFunc = new BaseFunc();
    private HomePage homePage;
    private RegistrationPage registrationPage;
    private SeatPage seatPage;
    private final String URL = "http://www.qaguru.lv:8090/tickets/";


    @Given("departure city is (.*) and arrival city is (.*)")
    public void set_destinations(String departure, String arrival){
        departureCity = departure;
        arrivalCity = arrival;
    }

    @Given("user data is:")
    public void set_user_data(Map<String, String> params){
        this.params = params;
    }

    @Given("seat is (.*)")
    public void set_seat(int seatNr){
        this.seatNr = seatNr;
    }

    @When("we are opening homepage")
    public void open_homepage(){
        baseFunc.openPage(URL);
        homePage = new HomePage(baseFunc);
    }

    @When("selecting destinations")
    public void select_destination(){
        homePage.selectDestinations(departureCity, arrivalCity);
    }

    @When("submitting the form")
    public void submit_form(){
        homePage.submitForm();
        registrationPage = new RegistrationPage(baseFunc);
    }

    @Then("application form appears")
    public void get_app_form(){

    }

    @When("we are filling in the user form")
    public void user_form_fill() {
        registrationPage.typeName(params.get("name"));
        registrationPage.typeSurname(params.get("surname"));
        registrationPage.typeDiscount(params.get("discount"));
        registrationPage.typeTravelerCount(params.get("travelerCount"));
        registrationPage.typeChildrenCount(params.get("childrenCount"));
        registrationPage.typeLuggageCount(params.get("luggageCount"));
        registrationPage.typeFlightDate(params.get("flight"));
    }

    @When("submitting the user form")
    public void submit_user_form(){
        registrationPage.submitUserForm();
        seatPage = new SeatPage(baseFunc);

    }

    @Then("seat selection appears")
    public void seat_selection_appears(){

    }

    @When("we are selected the seat")
    public void selecting_seat(){

    }

    @Then("confirmation page appears")
    public void confirm_page(){

    }

    @When("we are pressing Book link")
    public void press_book_link(){

    }

    @Then("successful page appears")
    public void booking_success(){

    }

    @When("we are receiving reservation list")
    public void get_reservation_list(){

    }

    @Then("our reservation is on the list")
    public void check_reservation_list(){

    }
}
