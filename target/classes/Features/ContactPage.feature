Feature: Contact Page Field Validation

@Testing
  Scenario: Verify the fields and Errors of the Contact Page
    Given user is on the HomePage of the Jupiter testing site
    When user click on the Contact Page
    And  user click on the Submit button
    Then Verify error messages for each field
    When User populate mandatory fields and click on submit
    Then Validate errors are gone
    And  Validate successful submission message
    Then Close the browser
