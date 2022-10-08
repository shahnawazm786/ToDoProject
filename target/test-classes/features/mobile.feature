@mobile
Feature: Mobile Search
  @mobilelink
  Scenario: A user want to visit only Mobile items
    Given user see the mobile link
    When user click on mobile link
    Then user verify the category title

    @mobileaccessories
    Scenario: A user click on Mobile Accessories
      Given user see the mobile link
      When user click on mobile link
      And user click on mobile accessories click
      Then user verify Shop by Category
