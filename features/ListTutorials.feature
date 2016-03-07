Feature: Tutorials list allowes new and old member of the Globant's  family to easaly pick the tutorial they are looking for

  @important
  Scenario: List the newest tutorials
    Given a glober who wants to know available tutorials
    When ask for the newest tutorials
    Then will see a tutorial for "TDD" by "fcayrol"
    And will see tutorials for "Angular" by "mrolon"
    And will see tutorials for "How to be a police" by "ppessolano"