@tag
Feature: Calculator

  Scenario: add two numbers
    Given Two input values, 1 and 2
    When I add the two values
    Then I expect the result 3

    Scenario Outline: add two numbers
      Given Two input values, <first> and <second>
      When I add the two values
      Then I expect the result <result>

      Examples:
      | first | second | result |
      | 1     | 2      | 3      |
      |-1     |6       |5       |
      |2      |2       |4       |


  Scenario: div two numbers
    Given Two input values, 10 and 2
    When I / two values
    Then I expect the result 5

  Scenario: pow two numebrs
    Given Two input values, 2 and 3
    When I ^ two values
    Then I expect the result 8

  Scenario Outline: pow and div
    Given Two input values, <first> and <second>
    When I <operator> two values
    Then I expect the result <result>
    Examples:
    | first | second | operator | result|
    | 20    | 4      | /   | 5     |
    |30     |6       |/    |5      |
    |5      |2       |^    |25     |
    |3      |3       |^    |27     |
