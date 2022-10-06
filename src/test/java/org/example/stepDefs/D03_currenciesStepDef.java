package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homePage;
import org.junit.Assert;

public class D03_currenciesStepDef {
    P03_homePage Home_page=new P03_homePage();
//    //option[@value="https://demo.nopcommerce.com/changecurrency/1?returnUrl=%2F"]    dollar
//    //option[@value="https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F"]    euro
@Given("user clicks on Euro curreny")
    public void Choosing_Euro(){
    Home_page.Custom_currency().click();
    Home_page.Euro_selection().click();

}
@Then("user checks if there Euros or not")
    public void Check_Euros() throws InterruptedException {
//    Home_page.Euro_items(i).size();
    Thread.sleep(5000);
    for (int i = 0; i<=3; i++){
        String Currencys = Home_page.Euro_items().get(i).getText();
//        System.out.println(Currencys);
        Assert.assertTrue(Currencys.contains("€"));

    }


}













}
