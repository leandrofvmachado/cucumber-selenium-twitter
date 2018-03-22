Feature: Add Tweet

    Scenario: Add a simple text tweet
        Given A user is logged in
        When The user types the tweet and hit the button
        Then The tweet is posted to your timeline