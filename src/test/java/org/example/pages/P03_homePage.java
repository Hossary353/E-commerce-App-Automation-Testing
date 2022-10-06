package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P03_homePage {

    public WebElement Custom_currency(){
        return Hooks.driver.findElement(By.id("customerCurrency"));
    }
    public WebElement Euro_selection(){
        return Hooks.driver.findElement(By.xpath("//option[@value=\"https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F\"]"));
    }

    public List<WebElement> Euro_items() {

        return Hooks.driver.findElements(By.xpath("//span[@class=\"price actual-price\"]"));
    }
    public WebElement Search_bar(){
        return Hooks.driver.findElement(By.id("small-searchterms"));
    }
    public WebElement Search_btn(){
        return Hooks.driver.findElement(By.xpath("//button[@class=\"button-1 search-box-button\"]"));
    }
    public int Search_items(){
        return Hooks.driver.findElements(By.xpath("//h2[@class=\"product-title\"]")).size();
    }
    public WebElement Product_result(){
        return Hooks.driver.findElement(By.xpath("//button[@class=\"button-2 product-box-add-to-cart-button\"]"));
    }
    public WebElement Get_SKU(){
        return Hooks.driver.findElement(By.id("sku-4"));
    }
    public WebElement Clickable_hovers(){
        return Hooks.driver.findElement(By.xpath("//a[@href=\"/computers\"]"));
    }

    public List<WebElement> subs(){
        return Hooks.driver.findElements(By.xpath("//div//ul//li//ul//li"));
    }

    public WebElement Page_title(){
        return Hooks.driver.findElement(By.xpath("//div[@class=\"page-title\"] "));
    }

    public WebElement Nokia_slide(){
        return Hooks.driver.findElement(By.xpath("//a[@href=\"http://demo.nopcommerce.com/\"]"));

    }

    public WebElement Iphone_slide(){
        return Hooks.driver.findElement(By.xpath("//a[@href=\"http://demo.nopcommerce.com/\"]"));

    }

    public WebElement Facebook(){
        return Hooks.driver.findElement(By.xpath("//a[@href=\"http://www.facebook.com/nopCommerce\"]"));

    }

    public WebElement Twitter(){
        return Hooks.driver.findElement(By.xpath("//a[@href=\"https://twitter.com/nopCommerce\"]"));

    }

    public WebElement Rss(){
        return Hooks.driver.findElement(By.xpath("//a[@href=\"/news/rss/1\"]"));
    }
    public WebElement Youtube(){
        return Hooks.driver.findElement(By.xpath("//a[@href=\"http://www.youtube.com/user/nopCommerce\"]"));
    }

    public WebElement Htc_wishlist(){
        return Hooks.driver.findElement(By.xpath("//div[@data-productid=\"18\"]//button[@class=\"button-2 add-to-wishlist-button\"]"));
    }

    public WebElement Success_msg(){
        return Hooks.driver.findElement(By.xpath("//div[@id=\"bar-notification\"]"));
    }

    public WebElement Back_color(){
        return Hooks.driver.findElement(By.xpath("//div[@class=\"bar-notification success\"]"));
    }

    public WebElement Wish_List(){
        return Hooks.driver.findElement(By.xpath("//span[@class=\"wishlist-label\"]"));
    }

    public WebElement QTY_no(){
        return Hooks.driver.findElement(By.xpath("//input[@class=\"qty-input\"]"));
    }







}
