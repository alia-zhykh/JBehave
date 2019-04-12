Narrative: I should be able to login to facebook

Scenario: I should see my name on the main page after I login to facebook

Given I open Facebook login page
!-- you should change parameters to real to make it work
When I login with 'master.yoda@jedi.com' and 'sithsAreEvil123'
Then I am on main page as 'Master Yoda'