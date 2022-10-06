package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P01_register {
    public WebElement registerlink()
    {
        return Hooks.driver.findElement(By.className("ico-register"));
    }
    public WebElement Gendertype_male(){
        return Hooks.driver.findElement(By.id("gender-male"));
    }
    public WebElement First_name(){
        return Hooks.driver.findElement(By.id("FirstName"));
    }
    public WebElement Second_name(){
        return Hooks.driver.findElement(By.id("LastName"));
    }
    public WebElement Birth_day(){
        return Hooks.driver.findElement(By.name("DateOfBirthDay"));

    }
    public WebElement Birth_month() {
        return Hooks.driver.findElement(By.name("DateOfBirthMonth"));
    }
    public WebElement Birth_year(){
        return Hooks.driver.findElement(By.name("DateOfBirthYear"));
    }
    public WebElement Email(){
        return Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement Password(){
        return Hooks.driver.findElement(By.id("Password"));
    }
    public WebElement Conf_password(){
        return Hooks.driver.findElement(By.id("ConfirmPassword"));
    }
    public WebElement Register_click(){
        return Hooks.driver.findElement(By.id("register-button"));
    }
    public WebElement Success_register(){
        return Hooks.driver.findElement(By.xpath("//div[@class=\"result\"]"));
    }
    public WebElement Already_exist(){
        return Hooks.driver.findElement(By.xpath("//div[@class=\"message-error validation-summary-errors\"]//li"));
    }













}
