25CBG9Q3nd_Fr.f
Feature: Search by keyword

  Scenario: Searching for a Cucumber
    Given Sergey is trying to login to Wikipedia
    When he enters "Jtamayagk1" and "25CBG9Q3nd_Fr.f"
    Then he should see "Hello, ‪Jtamayagk1‬!"