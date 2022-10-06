package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homePage;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D08_WishlistStepDef {

    SoftAssert softAssert=new SoftAssert();
    P03_homePage Home_Page=new P03_homePage();


    @Given("user clicks wish list button of htc")
    public void choose_htc_Wish_list() throws InterruptedException {
        Thread.sleep(2000);
        Home_Page.Htc_wishlist().click();

    }

    @Then("success added to wishlist message is displayed")
    public void Success() throws InterruptedException {

        String expected="The product has been added to your wishlist";
        Thread.sleep(1000);
        String Actual= Home_Page.Success_msg().getText();
        System.out.println(Actual);

        softAssert.assertTrue(Actual.contains(expected));
        softAssert.assertAll();
    }

    @And("^Background color equals to \"(.*)\"$")
    public void Check_color(String color) {

        String back_color =Home_Page.Back_color().getCssValue("background-color");
        System.out.println(back_color);

        softAssert.assertEquals(back_color,color);
        softAssert.assertAll();

    }

    @And("user waits till success message disappear")
    public void user_waits() throws InterruptedException {
        Thread.sleep(5000);
    }

    @Then("user clicks on wishlist button on top right corner")
    public void User_click_on_wishlist(){
        Home_Page.Wish_List().click();

    }

    @And("Check the Qty of wishlist item > 0")
    public void Check_QTy(){
       String QTYY= Home_Page.QTY_no().getAttribute("value");
        System.out.println(QTYY);

        Assert.assertNotNull(QTYY);
    }






}
