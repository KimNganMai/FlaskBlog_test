Feature: Reset password

#  Scenario: Open reset password page from login page
#    Given The login page is showed
#     When The user click to the forgot password button
#     Then Reset password page will be showed
#
  Scenario: Show error message after trying to login without username
    Given The Reset password page is showed
     When The User click send request
     Then The error message "Please fill out this field" is showed
  
  Scenario Outline: Show error message after trying to login with an invalid email
    Given The Reset password page is showed
     When The user attempt to reset their account password with Email <email> that is invalid
     Then The error message "Invalid email address. There is no account, please register first." is showed
    Examples: 
      | email           | 
      | ngan            | 
      | ngan@           | 
      | ngan @gmail.com | 
      | ngan@gmail      | 
  
  Scenario: Show error message after trying to login with wrong information
    Given The Reset password page is showed
     When The user attempt to reset their account password with Email "ngan22@gmail.com"
     Then The error message "There is no account, please register first." is showed
  
  Scenario: Reset password
    Given The Reset password page is showed
     When The user attempt to reset their account password with Email "knganav@gmail.com"
     Then The new password will be updated then sent to this mail box
  
  
