Feature: Delete Tweet

    Background:
        Given A user is logged in

    Scenario: Delete a tweet
        Given The user adds a Hello World tweet
        When The user deletes the Hello World tweet
        Then The Hello World tweet is deleted