Feature: Delete Tweet

    Scenario: Delete a tweet
        Given A user is logged in
        And The user add a tweet to his/her timeline
        When The user deletes the last tweet
        Then The tweet is deleted