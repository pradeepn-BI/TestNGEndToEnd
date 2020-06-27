package com.ReUsable;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



import java.security.PublicKey;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ReUsableMethods extends Base {

    public static Actions Action;
    public static WebElement menuOption, DropDown, Text;
    public static Select select;
    public static JavascriptExecutor js = (JavascriptExecutor) driver;


    public static void ClickHyperLink(By locatorname) {
        driver.findElement(locatorname).click();
    }

    public static void enterValuesInTextFeilds(By locatorname, String value) {

        driver.findElement(locatorname).sendKeys(value);

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

    public static void handlePopWindow() {

        driver.switchTo().alert().accept();
    }

    public static void scrollUpOrDownByObjectVisibility() {

        Text = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]"));
        js.executeScript("arguments[0].scrollIntoView(true);", Text);
        System.out.println(Text);
    }

    public static void scrollUpOrDownByPixels() {
        js.executeScript("window.scrollBy(0,600)");

    }

    public static void getErrorMessage(By locatorname) {
        //System.out.println(driver.findElement(locatorname).getText());
        //return driver.findElement(locatorname).getText();
    }

    public static void waitTillLoad() {
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

    }

    public static void selectInAutoSuggestions(By locatorname,String SearchText) throws InterruptedException {
        List<WebElement> autosuggestionslist = driver.findElements(locatorname);
        for (WebElement suggestion : autosuggestionslist) {
            if (suggestion.getText().equalsIgnoreCase(SearchText)) {
                suggestion.click();
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





