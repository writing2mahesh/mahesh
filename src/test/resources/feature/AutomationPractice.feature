@AutomationPractice-Home-Page
Feature: AutomationPractice Login test
@AutomtionPractice-e2e-test
Scenario: Validate AutomationPractice SignIn
Given I am on the home page of "http://automationpractice.com/" Automation Practice website
 When I select the option as SignIn
And I enter emailId as "writing2mahesh@gmail.com"
  And I enter password as "Mahesh@123"
  And I click signin button