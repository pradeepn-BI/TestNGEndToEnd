package com.ReUsable;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


import java.security.PublicKey;
import java.util.concurrent.TimeUnit;

public class ReUsableMethods extends Base {

    public static Actions Action;
    public static WebElement menuOption,DropDown,Text;
    public static Select select;
    public static JavascriptExecutor js = (JavascriptExecutor) driver;


    public static void ClickHyperLink(By locatorname){
        driver.findElement(locatorname).click();
    }

    public static void enterValuesInTextFeilds(By locatorname, String value){

        driver.findElement(locatorname).sendKeys(value);

    }


    public static void clickButton(By locatorname){
        driver.findElement(locatorname).click();
    }

    public static String getDisplayedMessage(By locatorname){
        System.out.println( driver.findElement(locatorname).getText());
        return driver.findElement(locatorname).getText();
    }

    public static void hooverOver(By locatorname){
     menuOption = driver.findElement(locatorname);
        Action= new Actions(driver);
        Action.moveToElement(menuOption).build().perform();
    }

    public static void selectFromDropDown(By locatorname,String value){

        DropDown = driver.findElement(locatorname);

        Select select = new Select(DropDown);
        select.selectByVisibleText(value);

    }

    public static void handlePopWindow(){

        driver.switchTo().alert().accept();
    }

    public static void scrollUpOrDownByObjectVisibility(By locatorname){

       Text = driver.findElement(locatorname);
        System.out.println(Text);
        js.executeScript("arguments[0].scrollIntoView();", Text);
    }

    public static void scrollUpOrDownByPixels(){
        js.executeScript("window.scrollBy(0,600)");

    }

    public static String getErrorMessage(By locatorname){
        System.out.println(driver.findElement(locatorname).getText());
        return driver.findElement(locatorname).getText();
    }

    public static void waitTillLoad(){
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

    }



}
