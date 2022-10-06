@smoke
Feature: Follow Us on social media
  Scenario: user opens facebook link
    Given user clicks on facebook icon
    Then check wether the url is changed to "https://www.facebook.com/nopCommerce"

  Scenario: user opens twitter link
    Given user clicks on Twitter icon
    Then check wether the url is changed to "https://twitter.com/nopCommerce"

  Scenario: user opens rss link
    Given user clicks on Rss icon
    Then check wether the url is changed to "https://demo.nopcommerce.com/new-online-store-is-open"
    
  Scenario: user opens youtube link
    Given user clicks youtube icon
    Then check wether the url is changed to "https://www.youtube.com/user/nopCommerce"







