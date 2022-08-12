package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class D06_homeSlidersStepDef {
    P03_homePage slider = new P03_homePage();

    SoftAssert softAssert = new SoftAssert();

    @Given("click on first slide nokia")
    public void firstSlide(){
        slider.slidepage.click();

    }

    @Then("should navigate to nokia url")
    public void NavigateToNokiaUrl() {
        String ExpectedResult = "https://demo.nopcommerce.com/nokia-lumia-1020";
        String AcutalResult = Hooks.driver.getCurrentUrl();
        softAssert.assertEquals(AcutalResult,ExpectedResult);
        softAssert.assertAll();

    }


    @Given("click on second slide Iphone")
    public void clickOnSecondSlideIphone() {

        WebDriverWait waitUntil = new WebDriverWait(Hooks.driver, Duration.ofSeconds(20));
        waitUntil.until(ExpectedConditions.attributeToBe(slider.secondSlide,"style","display: none;"));
           slider.slidepage.click();
    }

    @Then("should navigate to Iphone url")
    public void shouldNavigateToIphoneUrl() {
        String ExpectedResult = "url https://demo.nopcommerce.com/iphone-6";
        String AcutalResult = Hooks.driver.getCurrentUrl();
        softAssert.assertEquals(AcutalResult,ExpectedResult);
        softAssert.assertAll();
    }
}
