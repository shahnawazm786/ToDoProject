@amazon
Feature: Amazon In
  @amazon
  Scenario: Amazon search
    Given search the link
    When collect all text
    Then remove the duplicate text
    And show the all unique contents
