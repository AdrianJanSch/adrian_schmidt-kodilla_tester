# new feature
# Tags: optional

Feature: Is a Buzz, Fizz or FizzBuzz

  Scenario Outline: number is divisible by 3 or 5
    Given draw number is <nr>
    When divisible number by 3 or 5
    Then result is <res>
    Examples:
      | nr |  res|
      | 9   | "Fizz"  |
      | 8   | "None"  |
      | 10   | "Buzz"  |
      | 15   | "FizzBuzz"  |


