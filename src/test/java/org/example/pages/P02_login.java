package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_login {
    public WebElement Login(){
        return Hooks.driver.findElement(By.xpath("//a[@href=\"/login?returnUrl=%2F\"]"));
    }
    public WebElement Email_field(){
        return Hooks.driver.findElement(By.xpath("//input[@class=\"email\"]"));
    }
    public WebElement Pass_field(){
        return Hooks.driver.findElement(By.xpath("//input[@class=\"password\"]"));
    }
    public WebElement Login_btn(){
        return Hooks.driver.findElement(By.xpath("//button[@class=\"button-1 login-button\"]"));
    }
    public WebElement Unsuccessful_msg(){
        return Hooks.driver.findElement(By.xpath("//div[@class=\"message-error validation-summary-errors\"]"));
    }

}
