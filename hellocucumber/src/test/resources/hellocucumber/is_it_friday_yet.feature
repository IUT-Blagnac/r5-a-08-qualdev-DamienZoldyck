Feature: Is it Friday yet?
  I want to know if it's Friday today.

  Scenario Outline: Checking if today is Friday
    Given today is <day>
    When I ask if it's Friday
    Then I should be told "<answer>"

    Examples:
      | day            | answer |
      | Friday         | TGIF   |
      | Sunday         | Nope   |
      | anything else! | Nope   |
