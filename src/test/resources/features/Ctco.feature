@scenario
Feature: Verify that paragraph under Professional skills and qualification: contains exactly 5 skills

  Scenario: Verify number of skills
    Given Navigate to home page
    And Mouse over the Careers menu
    And Select Vacancies page from the menu
    Then Verify Vacancies page is displayed
    And Select vacancy "Test Automation Engineer"
    And Verify Test Automation page is displayed
    And Verify Professional skills and qualification: contains exactly "5" skills


