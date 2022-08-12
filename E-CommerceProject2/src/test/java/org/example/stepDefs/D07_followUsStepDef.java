package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.ArrayList;

public class D07_followUsStepDef {

    P03_homePage follow = new P03_homePage();

    ArrayList <String> multiTabs;
    SoftAssert softAssert = new SoftAssert();

    @Given("user opens facebook link")
    public void FBOpen(){
      follow.facebook.click();

    }

    @Given("user opens {string} link")
    public void userOpensLink(String pageType) {
        switch (pageType){
            case "facebook":
                follow.facebook.click();
                break;
            case "twitter":
                follow.twitter.click();
                break;
            case "rss":
                follow.rss.click();

            case "youtube":
                follow.youtube.click();


        }

    }


    @When("user able to open new tab")
    public void userAbleToOpenNewTab() {

        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(20));
            wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        multiTabs = new ArrayList<>(Hooks.driver.getWindowHandles());

    }

    @And("user can switch between tabs")
    public void userCanSwitchBetweenTabs() throws InterruptedException {
        Thread.sleep(2000);
        Hooks.driver.switchTo().window(multiTabs.get(1));
        System.out.println("tab 1:  " + Hooks.driver.getCurrentUrl());
        Thread.sleep(2000);
        Hooks.driver.switchTo().window(multiTabs.get(0));
        System.out.println("tab 0:  " + Hooks.driver.getCurrentUrl());
        Thread.sleep(2000);
        Hooks.driver.switchTo().window(multiTabs.get(1));

    }
    @Then("{string} is opened in new tab")
    public void isOpenedInNewTab(String url) throws InterruptedException {
        Thread.sleep(3000);
     String AcutalResult = Hooks.driver.getCurrentUrl();
        Assert.assertEquals(AcutalResult,url);
    }



}
