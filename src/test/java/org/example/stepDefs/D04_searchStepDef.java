package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homePage;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D04_searchStepDef {
    SoftAssert softAssert=new SoftAssert();
    P03_homePage Home_page=new P03_homePage();


@Given("^user enters search word \"(.*)\"$")
    public void Enter_search_keyword(String Key_word){
    Home_page.Search_bar().sendKeys(Key_word);

}


@And("click search")
    public void click_search(){
    Home_page.Search_btn().click();
}


@And("Url confirms that we are in the search page")
    public void Confirm_search_page(){
    String Current_url=Hooks.driver.getCurrentUrl();
    String Expected_url="https://demo.nopcommerce.com/search?q=";
    softAssert.assertTrue(Current_url.contains(Expected_url));
    softAssert.assertAll();
}

@Then("the expected result appears")
    public void Expected_Search_results(){
    int no=4;
    softAssert.assertEquals(Home_page.Search_items(),no);
    softAssert.assertAll();
}

@And("user clicks on products appears")
public void Click_product() throws InterruptedException {
    Home_page.Product_result().click();
    Thread.sleep(2000);
}


@Then("the expected Product appears")
    public void Expected_product(){
    String Sku=Home_page.Get_SKU().getText();
    String Actual_sku="AP_MBP_13";
    Assert.assertEquals(Sku,Actual_sku);

}





}
