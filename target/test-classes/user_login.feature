Feature: Login

    Scenario: Successful Login
        Given User is on frontpage
        When User insert correct password and email
        Then Do login