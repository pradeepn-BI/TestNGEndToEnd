package com.AutomationPractice.BusinessScripts;

import com.ReUsable.Locators;
import com.ReUsable.ReUsableMethods;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginPageTests extends ReUsableMethods{


    //Locators LC = new Locators();
//@Test
void verifyLoginWithValidDetails() {
    ClickHyperLink(By.xpath(Locators.SIGN_IN));
    enterValuesInTextFeilds(By.id("email"),"Testmail9845@gmail.com");
    enterValuesInTextFeilds(By.id("passwd"), "Pass123");
    clickButton(By.id("SubmitLogin"));
}
//@Test
void verifyLoginWithInvalidDetails() {
    ClickHyperLink(By.xpath(Locators.SIGN_IN));
    enterValuesInTextFeilds(By.id("email_create"), "TestNg@gmail.com");
    clickButton(By.id("SubmitCreate"));
    Assert.assertEquals(getDisplayedMessage(By.xpath(Locators.INVALID_EMAIL_ERROR)), Locators.exp_invalid_email_error);
    enterValuesInTextFeilds(By.id("email"), "Testnggmail.com");
    enterValuesInTextFeilds(By.id("passwd"), "Pass123");
    clickButton(By.id("SubmitLogin"));
    Assert.assertEquals(getDisplayedMessage(By.xpath("//li[contains(text(),'Invalid email address.')]")), Locators.Actual_Error_Invalid_emailId);
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

    void addToCartByHover() {
        ClickHyperLink(By.xpath("//*[@class ='logo img-responsive']"));
        hooverOver(By.xpath(Locators.DRESSES));
        ClickHyperLink(By.xpath(Locators.EVENING_DRESSES));
        hooverOver(By.xpath(Locators.EVEDRESS));
        clickButton(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span"));
        clickButton(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"));
        //scrollUpOrDownByObjectVisibility();
        clickButton(By.linkText("Proceed to checkout"));
    }
    //@Test
    void addToCartByColour(){
        ClickHyperLink(By.xpath("//*[@class ='logo img-responsive']"));
        hooverOver(By.xpath(Locators.DRESSES));
        ClickHyperLink(By.xpath(Locators.SUMMERDRESS));
        hooverOver(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img"));
        ClickHyperLink(By.xpath("//*[@id=\"color_20\"]"));
        //scrollUpOrDownByObjectVisibility(By.xpath("//*[@id=\'add_to_cart\']/button/span"));
        clickButton(By.xpath("//*[@id=\'add_to_cart\']/button/span"));
    }

    @Test
    void addToCartFromMore(){
        ClickHyperLink(By.xpath("//*[@class ='logo img-responsive']"));
        hooverOver(By.xpath(Locators.DRESSES));
        ClickHyperLink(By.xpath(Locators.SUMMERDRESS));
        hooverOver(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img"));
        clickButton(By.xpath("//*[@id='center_column']/ul/li[1]/div/div[2]/div[2]/a[2]/span"));
        selectFromDropDown(By.id("group_1"),"L");
        clickButton(By.id("color_13"));
        clickButton(By.id("add_to_cart"));
        ClickHyperLink(By.linkText("Proceed to checkout"));
        clickButton(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]"));
    }



}





//*[@class = 'alert alert-danger']//following-sibling::ol//following-sibling::li