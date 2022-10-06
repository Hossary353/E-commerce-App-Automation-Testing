package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homePage;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.Locale;


public class D05_hoverCategoriesStepDef {
    P03_homePage Home_page =new P03_homePage();

    Actions action = new Actions(Hooks.driver);

    String name;

    int min = 0;
    int max = 2;
    int selected_sub = (int) Math.floor(Math.random() * (max - min + 1) + min);

    @Given("User hover over random main category")
    public void hover_over() throws InterruptedException {
        action.moveToElement(Home_page.Clickable_hovers()).perform();
        Thread.sleep(3000);


    }

    @And("Select random sub category from main category")
            public void Random_subs() throws InterruptedException {


        System.out.println(selected_sub);
        name = Home_page.subs().get(selected_sub).getText();
        System.out.println(name);
        action.moveToElement(Home_page.subs().get(selected_sub)).click().perform();
        Thread.sleep(2000);
    }

    @Then("we get text of page title to make sure of correct choice")
    public void Get_page_title(){
        String Page_title= Home_page.Page_title().getText();
        Page_title=Page_title.toLowerCase(Locale.ROOT);
        name=name.toLowerCase(Locale.ROOT);
        Assert.assertEquals(name,Page_title);


    }



}
