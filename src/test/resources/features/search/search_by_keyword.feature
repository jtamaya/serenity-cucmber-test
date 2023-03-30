Feature: Search by keyword

  Scenario: Searching for a Cucumber
    Given Sergey is researching things on the internet
    When he looks up "Cucumber"
    Then he should see information about "Cucumber"


  Scenario: Searching for a Soccer
    Given Sergey is researching soccer on the internet
    When he looks up "Soccer"
    Then he should see information about "Association Football"