Feature: New post

#  Scenario Outline: Show error message after trying to post a post with a empty field
#    Given The New post page is showed
#     When The user attempt to post a new post with Title <title> and Content <content>
#     Then The error message "Vui lòng nhập đủ thông tin" will be showed
#    Examples:
#      | title    | content                                             |
#      | -        | -                                                   |
#      | -        | I am trying to post a new post for this test script |
#      | The test | -                                                   |
#
  Scenario: Successful posting
    Given The New post page is showed
     When The user attempt to post a new post with Title "The test" and Content "I am trying to make a new post for this test script"
     Then The message "Your post has been created!" will be show in the home page
  
  
