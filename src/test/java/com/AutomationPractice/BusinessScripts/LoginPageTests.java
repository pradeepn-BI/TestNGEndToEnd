package com.AutomationPractice.BusinessScripts;

import com.ReUsable.Locators;
import com.ReUsable.ReUsableMethods;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginPageTests extends ReUsableMethods{


    Locators LC = new Locators();


//    @BeforeClass
//    void addToCart(){
//        browserSetUpWithUrl();
//        hooverOver(By.xpath("//*[@id=\'block_top_menu\']/ul/li[2]/a"));
//        ClickHyperLink(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[3]/a"));
//    }
//
//    @AfterClass
//    void shutdown(){
//        tearDown();
//    }


//@Test

void verifyLoginWithValidDetails() {
    ClickHyperLink(By.xpath(LC.SIGN_IN));
    enterValuesInTextFeilds(By.id("email"),"Testmail9845@gmail.com");
    enterValuesInTextFeilds(By.id("passwd"), "Pass123");
    clickButton(By.id("SubmitLogin"));
}
//@Test
void verifyLoginWithInvalidDetails() {
    ClickHyperLink(By.xpath(LC.SIGN_IN));
    enterValuesInTextFeilds(By.id("email_create"), "TestNg@gmail.com");
    clickButton(By.id("SubmitCreate"));
    Assert.assertEquals(getDisplayedMessage(By.xpath(LC.INVALID_EMAIL_ERROR)), LC.exp_invalid_email_error);
    enterValuesInTextFeilds(By.id("email"), "Testnggmail.com");
    enterValuesInTextFeilds(By.id("passwd"), "Pass123");
    clickButton(By.id("SubmitLogin"));
    Assert.assertEquals(getDisplayedMessage(By.xpath("//li[contains(text(),'Invalid email address.')]")), LC.Actual_Error_Invalid_emailId);
    clearTextFeilds(By.id("email"));
    clearTextFeilds(By.id("passwd"));
    enterValuesInTextFeilds(By.id("email"), "Testmail9845@gmail.com");
    enterValuesInTextFeilds(By.id("passwd"), "");
    clickButton(By.id("SubmitLogin"));
    Assert.assertEquals(getDisplayedMessage(By.xpath("//li[contains(text(),'Password is required.')]")), "Password is required.");
    clearTextFeilds(By.id("email"));
    clearTextFeilds(By.id("passwd"));
    enterValuesInTextFeilds(By.id("email"), "Testmail9845@gmail.com");
    enterValuesInTextFeilds(By.id("passwd"), "Pas123");
    clickButton(By.id("SubmitLogin"));
    Assert.assertEquals(getDisplayedMessage(By.xpath("//li[contains (text(), 'Authentication failed.')]")), "Authentication failed.");
    clearTextFeilds(By.id("email"));
    clearTextFeilds(By.id("passwd"));
    enterValuesInTextFeilds(By.id("email"), "Failmail9845@gmail.com");
    enterValuesInTextFeilds(By.id("passwd"), "Pas123");
    clickButton(By.id("SubmitLogin"));
    Assert.assertEquals(getDisplayedMessage(By.xpath("//li[contains (text(), 'Authentication failed.')]")), "Authentication failed.");
    clearTextFeilds(By.id("email"));
    clearTextFeilds(By.id("passwd"));
    clickButton(By.id("SubmitLogin"));
    Assert.assertEquals(getDisplayedMessage(By.xpath("//li[contains (text(), 'An email address required.')]")), "An email address required.");
    //ClickHyperLink(By.linkText("Recover your forgotten password"));
}
    @Test
    void addToCart() {
        ClickHyperLink(By.xpath("//*[@class ='logo img-responsive']"));
        hooverOver(By.xpath(LC.DRESSES));
        ClickHyperLink(By.xpath(LC.EVENING_DRESSES));
        hooverOver(By.xpath(LC.EVEDRESS));
        clickButton(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span"));
        clickButton(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"));
        //waitTillLoad();

        scrollUpOrDownByObjectVisibility();
        clickButton(By.xpath("Proceed to checkout"));
        //scrollUpOrDownByPixels();

//        hooverOver(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img"));
//        ClickHyperLink(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]"));
//        ClickHyperLink(By.linkText("Proceed to checkout"));
//        ClickHyperLink(By.linkText("Proceed to checkout"));
        // waitTillLoad();

    }



}





//*[@class = 'alert alert-danger']//following-sibling::ol//following-sibling::li