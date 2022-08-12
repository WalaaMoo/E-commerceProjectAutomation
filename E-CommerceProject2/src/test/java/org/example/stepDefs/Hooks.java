package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {

    public  static WebDriver driver = null;

    @Before
    public static void OpenBrowse(){

        System.setProperty("webdriver.chrome.driver","/Users/lotfy/Desktop/E_Commerce Project/E-CommerceProject2/Driver/chromedriver");

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        driver.navigate().to("https://demo.nopcommerce.com/");

    }


    @After
    public static void CloseBrowser() throws InterruptedException {

             Thread.sleep(3000);
             driver.quit();

    }

}
