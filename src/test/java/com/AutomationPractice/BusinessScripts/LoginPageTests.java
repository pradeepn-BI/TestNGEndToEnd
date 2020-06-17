package com.AutomationPractice.BusinessScripts;

import com.ReUsable.ReUsableMethods;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.ReUsable.Locators;

public class LoginPageTests extends ReUsableMethods{


    Locators LC = new Locators();
    public static String expectedtitle;

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




void loginAndCompleteCheckOut() {

    ClickHyperLink(By.xpath(LC.LOGIN_BUTTON));
    expectedtitle = "Login - My Store";
    Assert.assertEquals(pageTitleVerification(), expectedtitle);
    enterValuesInTextFeilds(By.id("email_create"), "TestNg@gmail.com");
    clickButton(By.id("SubmitCreate"));
    //getDisplayedMessage(By.xpath("//*[@id=\'create_account_error\']/ol/li/text()"));
    // Assert.assertEquals(ActualResult,"1. An account using this email address has already been registered. Please enter a valid password or request a new one.");

    hooverOver(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a"));
    ClickHyperLink(By.linkText("Casual Dresses"));
    ClickHyperLink(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/h5/a"));
     clickButton(By.id("uniform-group_1"));
    selectFromDropDown(By.id("group_1"), "M");
    clickButton(By.id("add_to_cart"));
    ClickHyperLink(By.linkText("Proceed to checkout"));
    ClickHyperLink(By.linkText("Proceed to checkout"));
    enterValuesInTextFeilds(By.id("email"), "Testmail9845@gmail.com");
    enterValuesInTextFeilds(By.id("passwd"), "Pass123");
    clickButton(By.id("SubmitLogin"));
    scrollUpOrDownByObjectVisibility(By.xpath("//*[@id=\'center_column\']/form/p/button/span"));
    clickButton(By.xpath("//*[@id=\'center_column\']/form/p/button/span"));
    clickButton(By.id("uniform-cgv"));
    clickButton(By.xpath("//*[@id=\"form\"]/p/button/span"));
    scrollUpOrDownByObjectVisibility(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a"));
    clickButton(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a"));
    clickButton(By.xpath("//*[@id=\"cart_navigation\"]/button/span"));
    ClickHyperLink(By.id("header_logo"));
    hooverOver(By.xpath("//*[@id=\'block_top_menu\']/ul/li[2]/a"));
    ClickHyperLink(By.xpath("//*[@id=\'block_top_menu\']/ul/li[2]/ul/li[2]/a"));
    scrollUpOrDownByObjectVisibility(By.xpath("//*[@id=\'center_column\']/ul/li/div/div[1]/div/a[2]/span"));
    ClickHyperLink(By.xpath("//*[@id=\'color_43\']"));

}
      //  @Test
       void LoginVerification(){
            //sbrowserSetUpWithUrl("http://automationpractice.com/index.php");
            ClickHyperLink(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));

        enterValuesInTextFeilds(By.id("email"),"Testmail9845@gmail.com");
        enterValuesInTextFeilds(By.id("passwd"),"Pass123");
        clickButton(By.id("SubmitLogin"));
        clickButton(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a"));
        enterValuesInTextFeilds(By.id("email")," ");
        enterValuesInTextFeilds(By.id("passwd"),"Pass123");
        clickButton(By.id("SubmitLogin"));
        Assert.assertEquals(getErrorMessage(By.xpath("//*[text()='An email address required.']")),"An email address required.");
    }

    @Test
    void addToCart() {
        ClickHyperLink(By.xpath("//*[@class ='logo img-responsive']"));
        hooverOver(By.xpath("//*[@id='block_top_menu']/ul/li[1]/ul/li[2]/a)"));
               // "////a[contains(.,'Dresses')]"));
        //ClickHyperLink(By.linkText("Summer Dresses"));
        ClickHyperLink(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[3]/a"));
        //scrollUpOrDownByPixels();

        hooverOver(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img"));
        ClickHyperLink(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]"));
        ClickHyperLink(By.linkText("Proceed to checkout"));
        ClickHyperLink(By.linkText("Proceed to checkout"));
        // waitTillLoad();

    }



    }





//*[@class = 'alert alert-danger']//following-sibling::ol//following-sibling::li