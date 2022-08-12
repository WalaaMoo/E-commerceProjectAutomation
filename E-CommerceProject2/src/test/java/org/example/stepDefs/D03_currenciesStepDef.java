package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homePage;
import org.testng.asserts.SoftAssert;

public class D03_currenciesStepDef {

    P03_homePage currPage = new P03_homePage();

    SoftAssert softAssert = new SoftAssert();


    @Given("Select Euro currency from the dropdown list on the top left of home page")
    public void SelectEuro(){

        currPage.Euro.click();
    }


    @Then("verify Euro Symbol is shown")

    public  void VerifyEuroSymbol(){

       boolean EuroSymbol = true;
        for (int i=0;i<4 ;i++ ){

            if(!(currPage.priceProducts.get(i).getText().contains("€"))){
                EuroSymbol = false;
                break;

            }

            softAssert.assertTrue(EuroSymbol);
            softAssert.assertAll();

//            System.out.println("he found Euro sign");
        }

    }
}
