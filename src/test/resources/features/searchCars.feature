@searchCar
Feature: Accesptance testing to validate search car feature is working
         In order to validate that
         the search car page is working fine 
         We will do acceptance testing
  


  Scenario: Validate search cars page
    Given I am on the home page "https://www.carsguide.com.au" of Cars guide page
    When I move to  menu
      | menu       |
      | buy + sell |
      | reviews    |
    And I clicked on "Search Cars" link
    And select car brand as "BMW" from Anymake drop down
    And select model as "1 Series" from Any model dropdown
    And select location as "VIC - Melbourne" from Location dropdown
    And select price as "$10,000" from price dropdown
    And click on Find_My_Next_Car button
    Then I should see the list of seached cars
    And The page title should be "Bmw 1 Series Under 10000 for Sale Melbourne VIC | carsguide"
