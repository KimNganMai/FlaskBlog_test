Feature: User wants to edit information of the account

  Scenario: Show error message after trying to edit username become a taken one
    Given The Account page is showed
     When The user attempt to change information to Username "xxx" Email "knganav97@gmail.com"
     Then The message "Username is taken, choose another name" will be showed
  
  Scenario: Show error message after trying to edit Email become a taken one
    Given The Account page is showed
     When The user attempt to change information to Username "kngan97" Email "xxx"
     Then The message "xxx" will be showed
  
#  Scenario Outline: Show error message after trying to register with a email is invalid
#    Given The Account page is showed
#     When The user attempt to edit email with Email <email>
#     Then The message "Invalid email address" will be showed
#    Examples:
#      | email           |
#      | ngan            |
#      | ngan@           |
#      | ngan @gmail.com |
#      | ngan@gmail      |
  
  Scenario: Upload profile picture
    Given The Account page is showed
     When The user choose a picture from divice and upload it
     Then The profile picture is updated
  
  Scenario: Update successful
    Given The Account page is showed
     When The user attempt to change information to Username "xxx" Email "xxx"
     Then the profile information is updated
     
     
  
  