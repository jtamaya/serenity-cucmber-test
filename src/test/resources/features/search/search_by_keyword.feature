Feature: Search by keyword

  Scenario: Searching for a Cucumber
    Given Sergey is researching things on the internet
    When he looks up "Cucumber"
    Then he should see information about "Cucumber"

  Scenario: Searching for a Cucumber
    Given Sergey is researching things on the internet
    When he looks up "Orange"
    Then he should see information about "Orange"