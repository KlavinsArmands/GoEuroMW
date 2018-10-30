
Feature: This feature is about successful booking of trip
  Scenario: Successful booking
    Given I am in homepage
     And I set Riga Arpt as departure place
     And I set Barcelona Arpt as arrival place
     And I set 2019-02-07 as departure date
     And I unselect hotel booking
    When I click Search button
     And I select first train available
     And I click Go To Passenger Details button
     And I fill in Passenger Details page
     And I click Review journey details
    Then Review and Pay page is visible