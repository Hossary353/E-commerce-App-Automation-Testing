@smoke
Feature: Home sliders Feature
  Scenario: First slide is clickable on homepage
    Given user clicks on NOkia slider
    Then check wether the url is changed to "https://demo.nopcommerce.com/nokia-lumia-1020"



  Scenario: Second slide is clickable on homepage
    Given user clicks on Iphone slider
    Then check wether the url is changed to "https://demo.nopcommerce.com/iphone-6"
