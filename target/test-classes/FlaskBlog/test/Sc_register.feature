Feature: As a user, I want to register an account

#Register with: username - kngan97; email - knganav97@gmail.com; password - 123456
#Available informations: username - kngan; email - knganav@gmail.com

  Scenario Outline: Show error message after trying to register without some field
    Given The Register page is showed
     When The user attempt to register with Username <username> Email <email> Password <password> Confirm Password <cfpass>
     Then The message "xxx" will be showed
    Examples: 
      | username | email               | password | cfpass | 
      | -        | knganav97@gmail.com | 123456   | 123456 | 
      | kngan97  | -                   | 123456   | 123456 | 
      | kngan97  | knganav97@gmail.com | -        | 123456 | 
      | kngan97  | knganav97@gmail.com | 123456   | -      | 
      
  
  Scenario: Show error message after trying to register with a username is taken
    Given The Register page is showed
     When The user attempt to register with Username "kngan" Email "knganav97@gmail.com" Password "123456" Confirm Password "123456"
     Then The message "Username is taken, choose another name" will be showed below Username field
  
  Scenario Outline: Show error message after trying to register with a email is invalid
    Given The Register page is showed
     When The user attempt to register with Username <username> Email <email> Password <password> Confirm Password <cfpass>
     Then The message "Invalid email address." will be showed below email field
    Examples: 
      | username | email           | password | cfpass | 
      | kngan97  | ngan            | 123456   | 123456 | 
      | kngan97  | ngan@           | 123456   | 123456 | 
      | kngan97  | ngan @gmail.com | 123456   | 123456 | 
      | kngan97  | ngan@gmail      | 123456   | 123456 | 
     
  
  Scenario: Show error message after trying to register with a email is taken
    Given The Register page is showed
     When The user attempt to register with Username "kngan97" Email "knganav@gmail.com" Password "123456" Confirm Password "123456"
     Then The message "Email is taken, choose another email" will be showed below email field
  
  Scenario: Show error message when Confirm password is not equal to password.
    Given The Register page is showed
     When The user attempt to register with Username "kngan97" Email "knganav97@gmail.com" Password "123456" Confirm Password "123654"
     Then The message "Field must be equal to password." will be showed below Confirm password field
     
  Scenario: Register successful
    Given The Register page is showed
     When The user attempt to register with Username "kngan97" Email "knganav97@gmail.com" Password "123456" Confirm Password "123456"
     Then The login page will be showed
     And The message register successful will be showed
