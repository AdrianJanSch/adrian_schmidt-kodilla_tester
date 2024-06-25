Feature: Display balance
  Scenario: User checks the balance of their wallet
    Given there is 90 in my "wallet"
    When I check the balance of my "wallet" 90
    Then I should see that the "balance" is 90