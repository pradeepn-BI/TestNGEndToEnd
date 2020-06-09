package com.ReUsable;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.concurrent.TimeUnit;
import static io.github.bonigarcia.wdm.DriverManagerType.CHROME;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class Base {
    public static WebDriver driver;

    @BeforeTest
    public static void browserSetUpWithUrl() {
        WebDriverManager.getInstance(CHROME).setup();
        driver = new ChromeDriver();
        driver.navigate().to("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    public static void verifyLogo(By locatorname) {
        boolean logo = driver.findElement(locatorname).isDisplayed();
        Assert.assertEquals(logo, true);
    }

    public static String pageTitleVerification(){
        return driver.getTitle();
    }

   @AfterTest
    public static void tearDown() {
        driver.quit();
    }

}