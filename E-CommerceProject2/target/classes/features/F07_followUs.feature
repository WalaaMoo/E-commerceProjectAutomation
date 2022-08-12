@smoke
Feature: users could open followUs links

  Scenario: user opens facebook link
    Given user opens "facebook" link
      When user able to open new tab
      And  user can switch between tabs
      Then "https://www.facebook.com/nopCommerce" is opened in new tab


  Scenario: user opens twitter link
    Given user opens "twitter" link
    When user able to open new tab
    And  user can switch between tabs
    Then "https://twitter.com/nopCommerce" is opened in new tab


  Scenario: user opens twitter link
    Given user opens "rss" link
    When user able to open new tab
    And  user can switch between tabs
    Then "https://demo.nopcommerce.com/new-online-store-is-open" is opened in new tab

  Scenario: user opens twitter link
    Given user opens "youtube" link
    When user able to open new tab
    And  user can switch between tabs
    Then "https://www.youtube.com/user/nopCommerce" is opened in new tab

