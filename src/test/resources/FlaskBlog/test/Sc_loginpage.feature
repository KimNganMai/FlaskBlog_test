
Feature: User login to the blog

#  Issue1
  Scenario: Show error message after trying to login without username
    Given The login page is showed
    When The User attempt to login with username is "ngan@gmail.com" and password is none
    Then The message "This field is required." is showed below password field

#  Issue2
  Scenario: Show error message after trying to login without password
    Given The login page is showed
    When The User attempt to login with username is none and password is "123456"
    Then The message "This field is required." is showed below email field

#  Issue3
  Scenario Outline: Show error message after trying to login with an invalid email
    Given The login page is showed
    When The User attempt to login with username is <username> and password is <password>
    Then The message "Invalid email address." is showed below email field
    Examples:
      | username        | password |
      | ngan            | 123456   |
      | ngan@           | 123456   |
      | ngan @gmail.com | 123456   |
      | ngan@gmail      | 123456   |

#  Issue4
  Scenario Outline: Show error message after trying to login with wrong information
    Given The login page is showed
    When The User attempt to login with username is <username> and password is <password>
    Then The unsuccess message "Login Unsuccessful. Please check username and password" is showed in the top of page
    Examples:
      | username          | password |
      | ngan12345@gmail.com | 123456   |
      | ngan@gmail.com    | 123456@  |

#  Issue5
  Scenario: Show the homepage after login with valid Credetials
    Given The login page is showed
    When The User login success with username is "ngan@gmail.com" and password is "123456"
    Then The home page is showed

