@smoke
  Feature: Choose Euro currency from the dropdown list on the top left of home page
    Scenario: choose Euro Currency
      Given Select Euro currency from the dropdown list on the top left of home page
      Then  verify Euro Symbol is shown
