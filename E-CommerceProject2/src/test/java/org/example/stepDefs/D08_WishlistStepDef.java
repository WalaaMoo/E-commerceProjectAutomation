package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homePage;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;

public class D08_WishlistStepDef {

    P03_homePage wishList = new P03_homePage();


    SoftAssert softAssert = new SoftAssert();

    @Given("user press on wishlist Button")
    public void WishListBtn(){

        wishList.wishBtn.click();
    }

    @Then("the success Msg will display")
    public void displayMsg() throws InterruptedException {
        Thread.sleep(2000);
        softAssert.assertTrue(wishList.NotifyMsg.isDisplayed());
        softAssert.assertAll();

    }

    @And("User will open wishlist page")
    public void userWillOpenWishlistPage() throws InterruptedException {
        Thread.sleep(5000);
        wishList.wishlistLabel.click();
    }


}
