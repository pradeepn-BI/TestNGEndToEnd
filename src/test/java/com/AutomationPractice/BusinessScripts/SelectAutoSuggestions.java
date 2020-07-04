package com.AutomationPractice.BusinessScripts;

import com.ReUsable.ReUsableMethods;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;

public class SelectAutoSuggestions extends ReUsableMethods {

    @Test
    void selectautosuggestions() throws InterruptedException {
        //enterValuesInTextFeilds(By.id("search_query_top"),"Dresses");
        //selectInAutoSuggestions(By.xpath("//*[@id=\'index\']/div[2]/ul/li"),"Dresses");
        //*[@id = 'ui-id-1']
        enterValuesInTextFeilds(By.id("gh-ac"),"Bike");
        Thread.sleep(3000);
        selectInAutoSuggestions(By.id("ui-id-1"),"bike lights");
        System.out.println(pageTitleVerification());
        Assert.assertEquals(pageTitleVerification(),"bike helmet | eBay");
    }


}
