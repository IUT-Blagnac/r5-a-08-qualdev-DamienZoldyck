Feature: Is it Friday yet?
  I want to know if it's Friday today.

  Scenario: Today is Sunday
    Given today is Sunday
    When I ask if it's Friday
    Then the answer should be "No"

  Scenario: Friday is Friday
    Given today is Friday
    When I ask if it's Friday
    Then I should be told "TGIF"
