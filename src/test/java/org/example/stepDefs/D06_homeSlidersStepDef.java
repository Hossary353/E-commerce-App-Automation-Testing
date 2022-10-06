package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homePage;
import org.testng.Assert;

public class D06_homeSlidersStepDef {
    P03_homePage Home_Page=new P03_homePage();


    @Given("user clicks on NOkia slider")
    public void Click_on_Nokie() throws InterruptedException {
        Thread.sleep(2000);
        Home_Page.Nokia_slide().click();

    }

    @Then("^check wether the url is changed to \"(.*)\"$")
    public void Check_url(String URL) throws InterruptedException {

        String actual_url= Hooks.driver.getCurrentUrl();
        Thread.sleep(3000);
        System.out.println(actual_url);
        Assert.assertEquals(actual_url,URL);

    }

    @Then("user clicks on Iphone slider")
    public void Click_on_Iphone() throws InterruptedException {
        Thread.sleep(2000);
        Home_Page.Iphone_slide().click();

    }

}
