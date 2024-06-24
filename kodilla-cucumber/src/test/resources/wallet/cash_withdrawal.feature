# new feature
# Tags: optional

Feature: Cash Withdrawal
  Scenario: Successful withdrawal from a wallet in credit
      Given I have deposited $200 in my wallet
      When I request $30
      Then $30 should be dispensed



    Scenario: Unsuccessful withdrawal form a wallet
      Given I have deposited $100 in my wallet
      When I request $101
      Then $0 should be dispensed


 Scenario: Successful withdrawal form a wallet
      Given I have deposited $110 in my wallet
      When I request $110
      Then $110 should be dispensed
