# new feature
# Tags: optional

Feature: Deposit
  Scenario: User deposit money to wallet
      Given there is 100 in my wallet
      When I deposit 90
      Then Should the balance is 190
      And I should see that the balance is 190
