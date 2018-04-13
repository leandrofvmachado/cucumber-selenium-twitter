Feature: Login

    Scenario: Successful Login
        Given User is on frontpage
        When User insert correct password and email
        Then Do login

    Scenario: Unsuccessful Login
        Given User is on frontpage
        When User insert incorrect password or email
        Then A login error message is displayed