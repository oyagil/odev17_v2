Feature: Webtables Test

  Scenario: Add and Edit Record
    Given I open the webtables page
    When I click on the "Add" button
    And I fill in the form with new record details
    And I click the "Submit" button
    Then the new record should be added successfully
    When I edit the newly added record
    And I update the record details
    And I click the "Save" button
    Then the record should be updated successfully
