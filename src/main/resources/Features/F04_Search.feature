@smoke
  Feature: Search feature
    Scenario:user searches for products
      Given user enters search word "book"
      And click search
      And Url confirms that we are in the search page
      Then the expected result appears






    Scenario: user search fo product 2
      Given user enters search word "AP_MBP_13"
      And click search
      And Url confirms that we are in the search page
      And user clicks on products appears
      Then the expected Product appears