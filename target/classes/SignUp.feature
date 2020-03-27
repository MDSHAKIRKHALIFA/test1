Feature: SignUp for multicard
  I want to signup for the wetsite

  Scenario: Successful Scenario
    Given I open browser chrome
    When I land on multicart landing page
    Then I complete signup with shakir valid credentails
    And I expect signup successfully
