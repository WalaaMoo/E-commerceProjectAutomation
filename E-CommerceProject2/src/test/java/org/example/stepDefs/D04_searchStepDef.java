package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.Locale;

public class D04_searchStepDef {
    P03_homePage search = new P03_homePage();

    SoftAssert softAssert = new SoftAssert();


    @When("Write product {string}")
    public void writeProductName(String productName) {

        search.searchTxt.sendKeys(productName);
    }

    @And("press search button")
    public void pressBtn() {

        search.searchBtn.click();
    }


    @Then("search results contains {string}")
    public void searchResultsContains(String productName) {



        boolean visable = true;
        int count = search.productResult.size();

        System.out.println("the count is " + count + " the product name is " + productName);


        for (int i = 0; i < count - 1; i++) {
            if (!(search.productResult.get(i).getText().toLowerCase(Locale.ROOT).contains(productName.toLowerCase()))) {
                visable = false;
                break;
            }
            softAssert.assertTrue(visable);
            softAssert.assertAll();
        }
    }


    @Given("Write product {string} using Sku")
    public void writeProductUsingSku(String skuName) {

        search.searchTxt.sendKeys(skuName);
    }


    @And("press search button after search")
    public void pressSearchButtonAfterSearch() {
        search.searchBtn.click();
    }

    @Then("search results contains {string} using Sku")
    public void searchResultsContainsUsingSku(String skuName) {

        boolean visable = true;
        search.pictureIcon.click();

        System.out.println("Sku Full value: " + search.Skufiled.getText());

        if(!(search.Skufiled.getText().contains(skuName))) {
            visable = false;
        }

        Assert.assertTrue(visable);


        }
    }
