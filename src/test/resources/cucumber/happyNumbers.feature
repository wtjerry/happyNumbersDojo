Feature: HappyNumbers

  Scenario: User Checks 7
    When I check if the number 7 is happy
    Then the answer is yes

  Scenario: User Checks 4
    When I check if the number 4 is happy
    Then the answer is no

  Scenario: User Checks -68
    When I check if the number -68 is happy
    Then the answer is yes


  Scenario: User Checks -4
    When I check if the number -4 is happy
    Then the answer is no

  Scenario: User Checks -1
    When I check if the number -1 is happy
    Then the answer is yes
