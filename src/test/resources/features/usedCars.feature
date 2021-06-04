@used-CarSearch
Feature: Accesptance testing to validate search car feature is working
         In order to validate that
         the search car page is working fine 
         We will do acceptance testing

  

  Scenario: Validate used cars page
  Given I am on the home page "https://www.carsguide.com.au" of Cars guide page
    When I move to  menu
      | menu       |
      | buy + sell |
      | reviews    |
    And I clicked on used car "Used" link
    And select Used car brand as "Audi" from Anymake drop down
    And select used car model as "A4" from Any model dropdown
    And select used car location as "ACT - All" from Location dropdown
    And select used car price as "$20,000" from price dropdown
    And click on used car Find_My_Next_Car button
    Then I should see the list of Used cars
    And The page title of used cars be "Used Audi A4 Under 20000 for Sale ACT | carsguide"
