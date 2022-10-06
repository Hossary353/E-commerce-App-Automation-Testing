package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {
    P01_register register = new P01_register();
    @Given("user go to register page")
    public void goRegisterPage()
    {
        register.registerlink().click();
        }
    @And("user select gender type")
    public void select_male()
    {
        register.Gendertype_male().click();

    }
    @And("user enter first name \"automation\" and last name \"tester\"")
    public void Enter_first_second(){
        register.First_name().sendKeys("automation");
        register.Second_name().sendKeys("tester");
    }
    @And("user enter date of birth")
    public void Enter_birth_date(){
        register.Birth_day().sendKeys("12");
        register.Birth_month().sendKeys("May");
        register.Birth_year().sendKeys("1991");

    }
    @When("user enter email \"test@exampless.com\" field")
    public void Enter_Email(){
        register.Email().sendKeys("test@exampless.com");
    }
    @And("user fills Password fields \"P@ssw0rd\" \"P@ssw0rd\"")
    public void Enter_pass(){
        register.Password().sendKeys("P@ssw0rd");
        register.Conf_password().sendKeys("P@ssw0rd");
    }
    @Then("user clicks on register button")
    public void Clicks_register(){
        register.Register_click().click();
    }
    @And("success message is displayed")
    public void Success_msg(){
        String msg = register.Success_register().getText();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(msg,"Your registration completed");
        softAssert.assertAll();
        //      //div[@class="result"]
//Your registration completed

    }



















    }

