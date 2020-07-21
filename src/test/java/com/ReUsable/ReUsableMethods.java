package com.ReUsable;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReUsableMethods extends Base {

    public static Actions Action;
    public static WebElement menuOption, DropDown, Text;
    public static Select select;
    public static List<WebElement> autosuggestionslist;
    public static JavascriptExecutor js = (JavascriptExecutor) driver;



    public static void ClickHyperLink(By locatorname) {
        driver.findElement(locatorname).click();
    }

    public static void enterValuesInTextFeilds(By locatorname, String value) {

        driver.findElement(locatorname).sendKeys(value);

    }

    public static String readValueInfeild(By locatorname,String AttributeValue){
        System.out.println(driver.findElement(locatorname).getAttribute(AttributeValue));
        return driver.findElement(locatorname).getAttribute(AttributeValue);

    }


    public static void clickButton(By locatorname) {
        driver.findElement(locatorname).click();
    }

    public static String getDisplayedMessage(By locatorname) {
        System.out.println(driver.findElement(locatorname).getText());
        return driver.findElement(locatorname).getText();
    }

    public static void hooverOver(By locatorname) {
        menuOption = driver.findElement(locatorname);
        Action = new Actions(driver);
        Action.moveToElement(menuOption).build().perform();
    }

    public static void selectFromDropDown(By locatorname, String value) {

        DropDown = driver.findElement(locatorname);

        Select select = new Select(DropDown);
        select.selectByVisibleText(value);

    }

    public static void scrollToElement(By locatorname) {
            Text = driver.findElement(locatorname);
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Text);
            System.out.println(Text.getText());
    }

    public static void scrollUpOrDownByPixels() {
        js.executeScript("window.scrollBy(0,600)");

    }

     public static void searchForElementAndClick(By locatorname,String SearchText){
         List<WebElement> searches = new ArrayList<WebElement>();

              searches = driver.findElements(locatorname);


       for (int i = 0; i < searches.size() ; i++) {
                
               if (searches.get(i).getText().contains(SearchText)) {
                   searches.get(i).click();
                   break;
               } else {
                   waitTillLoad();
                   try {
                       searches = driver.findElements(locatorname);
                       List<WebElement> needtoclick = driver.findElements(By.cssSelector("nav a"));
                       ((JavascriptExecutor) driver).executeScript("arguments[0].click()", needtoclick.get(i + 2));
                   } catch (org.openqa.selenium.StaleElementReferenceException ex) {
                       waitTillLoad();
                       searches = driver.findElements(locatorname);
                       List<WebElement> needtoclick = driver.findElements(By.cssSelector("nav a"));
                       ((JavascriptExecutor) driver).executeScript("arguments[0].click()", needtoclick.get(i + 2));

                   }
               }

           }
       }


    public static void waitTillLoad() {
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

    }

    public static void selectInAutoSuggestions(By locatorname,String SearchText, String attributename) {
        List<WebElement> autosuggestionslist = driver.findElements(locatorname);
             for(int i=0;i<autosuggestionslist.size();i++) {
                 //if(autosuggestionslist.get(i).getAttribute(attributename).equals(SearchText)) {
                 if(autosuggestionslist.get(i).getAttribute(attributename).equals(SearchText)) {
                     ((JavascriptExecutor) driver).executeScript("arguments[0].click()",
                             autosuggestionslist.get(i));
                     break;
                 }
             }
            

            }


    public static void clearTextFeilds(By locatorname){
        WebElement toClear = driver.findElement(locatorname);
        toClear.sendKeys(Keys.CONTROL + "a");
        toClear.sendKeys(Keys.DELETE);

    }



}





