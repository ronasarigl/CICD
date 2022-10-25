Feature: Get Account
  As a user
  I want to get my account
  So I can manage my account

  Scenario: Get account with invalid UserId
    Given I set invalid UserId
    When I request get account
    Then I will get 401
    And get User not authorized! message








