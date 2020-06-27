package com.AutomationPractice.BusinessScripts;

import com.ReUsable.ReUsableMethods;
import org.openqa.selenium.By;
import org.testng.annotations.*;

public class SelectAutoSuggestions extends ReUsableMethods {

    @Test
    void selectautosuggestions() throws InterruptedException {
        enterValuesInTextFeilds(By.id("search_query_top"),"Dresses");
        selectInAutoSuggestions(By.xpath("//*[@id=\'index\']/div[2]/ul/li"),"Dresses");
        Thread.sleep(5000);

    }


}
