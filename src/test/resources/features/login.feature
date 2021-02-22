
Feature: 1. As a user, I should be able to login to the library app. Verify both Students and librarians can login

  @wip
  Scenario Outline:
    Given User is on Library login "url" page
    Given the user login as a "<role>"
    Then the user on  "<page>"

    Examples:
      | role      | page       |
      | student   | books     |
      | librarian | dashboard |