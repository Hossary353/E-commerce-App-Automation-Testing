@smoke
  Feature: Hover categories Feature
    Scenario: User hover to a Category and choose random sub category
      Given User hover over random main category
      And Select random sub category from main category
      Then we get text of page title to make sure of correct choice
