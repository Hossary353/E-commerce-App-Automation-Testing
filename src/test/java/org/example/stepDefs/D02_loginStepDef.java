package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef {
    SoftAssert softAssert=new SoftAssert();
    P02_login login=new P02_login();
    @Given("user go to login page")
    public void Login_page(){
        login.Login().click();

    }
    @When("^user login with \"valid\" \"(.*)\" and \"(.*)\"$")
    public void Enter_email_pass(String Email,String Password){
        login.Email_field().sendKeys(Email);
        login.Pass_field().sendKeys(Password);
    }
    @And("user press on login button")
    public void Press_login(){
        login.Login_btn().click();
    }
    @Then("user login to the system successfully")
    public void Success_login(){
        String url= Hooks.driver.getCurrentUrl();
        softAssert.assertEquals(url,"https://demo.nopcommerce.com/");
        String My_acc =Hooks.driver.findElement(By.xpath("//a[@class=\"ico-account\"]")).getText();
        softAssert.assertEquals(My_acc,"My account");
        softAssert.assertAll();


    }
    @Then("user login unsuccessful")
    public void Unsuccessful(){
        String color= login.Unsuccessful_msg().getCssValue("color");
        softAssert.assertEquals(color,"rgba(228, 67, 75, 1)");
        softAssert.assertAll();


    }
    @When("^user login with \"INvalid\" \"(.*)\" and \"(.*)\"$")
    public void Enter_Invalid_email_pass(String Email,String Password){
        login.Email_field().sendKeys(Email);
        login.Pass_field().sendKeys(Password);
    }





}
