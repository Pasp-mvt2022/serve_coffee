Feature: serve coffee

  Scenario Outline: Buy a cup of coffee
    Given There is <number> cups of coffee left
    And I have paid <money>
    Then I will be served <amount> coffee

    Examples:
      | number | money | amount |
      | 10     | 10    | 1      |
      | 10     | 110   | 10     |
      | 30     | 20    | 2      |
      | 10     | 20    | 2      |

  Scenario Outline: Refund money
    Given There is <number> cups of coffee left
    And I have paid <money>
    Then I will be served <amount> coffee
    And I will get <amountMoney> money back

    Examples:
      | number | money | amount | amountMoney |
      | 1      | 15    | 1      | 5           |
      | 10     | 27    | 2      | 7           |
      | 10     | 110   | 10     | 10          |
      | 10     | 117   | 10     | 17          |

  Scenario Outline: Make coffee
    Given There is <number> cups of coffee left
    And I make <makeNumber> cups of coffee
    Then The coffee machine have <amount> cups of coffee

    Examples:
      | number | makeNumber | amount |
      | 10     | 3          | 13     |
      | 10     | 27         | 37     |

  Scenario Outline: Buy different types of coffee
    Given I have chosen what "<type>" of coffee I want
    Given There is <number> cups of coffee left
    And I have paid <money>
    When I "<pressed>" the button
    Then I will be served <amount> coffee

    Examples:
      | type      | number | money | pressed | amount |
      | Black     | 10     | 10    | yes     | 1      |
      | Espresso  | 10     | 15    | yes     | 1      |
