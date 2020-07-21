package com.AutomationPractice.BusinessScripts;

import com.ReUsable.ReUsableMethods;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;

public class SelectAutoSuggestions extends ReUsableMethods {

    //@Test
    void selectautosuggestions() throws InterruptedException {
        enterValuesInTextFeilds(By.id("gh-ac"),"Bike");
        selectInAutoSuggestions(By.cssSelector(".ui-front li a"),"bike helmet","aria-label");
        Assert.assertEquals(pageTitleVerification(),"bike helmet | eBay");
    }


}
