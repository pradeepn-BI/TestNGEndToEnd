package com.AutomationPractice.BusinessScripts;

import com.ReUsable.Locators;
import com.ReUsable.ReUsableMethods;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AutomationPractice extends ReUsableMethods {


    public static void verifyCartEmpty(){
        ClickHyperLink(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a"));
        Assert.assertEquals(getDisplayedMessage(By.xpath("//*[@class = 'alert alert-warning']")),"Your shopping cart is empty.");
    }
    @Test
    public static void addItemsToCartAndVerify(){
        hooverOver(By.xpath(Locators.DRESSES));
        ClickHyperLink(By.xpath(Locators.EVENING_DRESSES));
        hooverOver(By.xpath(Locators.EVEDRESS));
        clickButton(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span"));
        clickButton(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"));
        getDisplayedMessage(By.xpath("//*[@class = 'cart_quantity_input form-control grey']"));


    }


}
