Feature: Testing elements page
  Scenario: Clicking on Buttons and verifying the message
    Given I am on the elements page
    When I click on the Buttons element
    And I click on the Click Me button
    Then I should see the message