Feature: a feature with a scenario outline

  Scenario Outline: a scenario with examples
    When we add "<x>" to "<y>"
    Then sum equals "<sum>"

    Examples:
      | x | y | sum |
      | 2 | 2 | 4   |
      # The one below should make the test fail
      | 1 | 1 | 3   |