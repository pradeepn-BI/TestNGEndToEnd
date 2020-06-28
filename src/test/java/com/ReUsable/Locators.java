package com.ReUsable;


import org.openqa.selenium.WebElement;

public class Locators extends Base {

    public static String SIGN_IN = "//*[@class = 'login']";
    public static String INVALID_EMAIL_ERROR = "//li[contains(text(),'An account using this email address has already been registered. Please enter a valid password or request a new one. ')]";
    public static String exp_invalid_email_error = "An account using this email address has already been registered. Please enter a valid password or request a new one.";
    public static String Actual_Error_Invalid_emailId ="Invalid email address.";
    public static String DRESSES = "//*[@id=\"block_top_menu\"]/ul/li[2]/a";
    public static String EVENING_DRESSES = "//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[2]/a";
    public static String EVEDRESS = "//*[@id='center_column']/ul/li/div/div[1]/div/a[1]/img";
}