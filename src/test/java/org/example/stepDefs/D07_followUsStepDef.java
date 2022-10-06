package org.example.stepDefs;

import io.cucumber.java.en.Given;
import org.example.pages.P03_homePage;

import java.util.ArrayList;

public class D07_followUsStepDef {
    P03_homePage Home_Page=new P03_homePage();



    @Given("user clicks on facebook icon")
    public void Click_face() throws InterruptedException {
        Home_Page.Facebook().click();
        Thread.sleep(2000);
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        Thread.sleep(2000);


    }

    @Given("user clicks on Twitter icon")
    public void Click_Twitter() throws InterruptedException {
        Home_Page.Twitter().click();
        Thread.sleep(2000);
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        Thread.sleep(2000);

    }

    @Given("user clicks on Rss icon")
    public void Click_Rss() throws InterruptedException {
        Home_Page.Rss().click();
        Thread.sleep(2000);
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        Thread.sleep(2000);

    }

    @Given("user clicks youtube icon")
    public void Click_youtube() throws InterruptedException {
        Home_Page.Youtube().click();
        Thread.sleep(2000);
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        Thread.sleep(2000);

    }


}
