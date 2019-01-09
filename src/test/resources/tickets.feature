Feature: Ticket reservation test

  Scenario: Reservation creation test check
    Given departure city is RIX and arrival city is SFO
    And user data is:
      | name          | Ieva       |
      | surname       | Buša       |
      | discount      | ABC        |
      | travelerCount | 1          |
      | childrenCount | 0          |
      | luggageCount  | 1          |
      | flight        | 11-05-2018 |
    And seat is 26
    When we are opening homepage
    And selecting destinations
    And submitting the form
    Then application form appears
    When we are filling in the user form
    And submitting the user form
    Then seat selection appears
    When we are selected the seat
    Then confirmation page appears
    When we are pressing Book link
    Then successful page appears

    When we are receiving reservation list
    Then our reservation is on the list
