Feature: Logout

  Scenario: Successful Logout
    Given A user is logged in
    When The user clicks on logout
    Then The user is logged out