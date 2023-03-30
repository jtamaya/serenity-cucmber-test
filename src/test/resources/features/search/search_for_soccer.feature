Feature: Search for soccer

  Scenario: Searching for a term
    Given Sergey is researching soccer on the internet
    When he looks up "Soccer"
    Then he should see information about "Association Football"