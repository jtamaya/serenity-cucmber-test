Feature: Search by keyword

  Scenario: Searching for a term
    Given Sergey is researching things on the internet
    When he looks up "Cucumber"
    Then he should see information about "Cucumber"


  Scenario: Searching for a term
    Given Sergey is researching soccer on the internet
    When he looks up "Soccer"
    Then he should see information about "Association Football"