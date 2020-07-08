package com.AutomationPractice.BusinessScripts;

import com.ReUsable.ReUsableMethods;
import org.openqa.selenium.By;
import org.testng.annotations.*;

public class FlipKart extends ReUsableMethods {
@Test
    public static void SearchAndSelect(){
        waitTillLoad();
        clickButton(By.xpath("//*[@class ='_2AkmmA _29YdH8']"));
        hooverOver(By.xpath("//*[@class = '_1QZ6fC _3Lgyp8']"));
        ClickHyperLink(By.linkText("Samsung"));
        scrollToElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[3]/div[3]/div/div[1]/div[1]/h2"));
        ClickHyperLink(By.xpath("//*[@id=\"container\"]/div/div[3]/div[3]/div[4]/div/div[1]/div[2]/a"));
    System.out.println(getElementText(By.xpath("//*[@class = '_1vC4OE _2rQ-NK']")));
    if (getElementText(By.xpath("//*[@class = '_1vC4OE _2rQ-NK']")).contains("₹10,000")) {
        ClickHyperLink(By.xpath("//*[@class='_3wU53n']"));
    }
//        enterValuesInTextFeilds(By.xpath("//*[@class = 'LM6RPg']"),"Mobiles");
//        clickButton(By.xpath("//*[@id=\'container\']/div/div[1]/div[1]/div[2]/div[2]/form/div/button"));
//        ClickHyperLink(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[2]/div[1]/div/div/div[2]/div[3]"));

    }



}
