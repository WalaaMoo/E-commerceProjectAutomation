package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_Login;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

public class D02_LoginStepDef {


    P02_Login login = new P02_Login();
    SoftAssert softAssert = new SoftAssert();

    @Given("user go to login page")
    public void LoginPage() {
        login.LoginIcon.click();



    }



    @When("user login with valid email and password")
    public void userLoginWithValidAnd() throws IOException {
        String email = ConfigurationReader.get("email");
        login.email.sendKeys(email);
        login.pass.sendKeys("P@ssw0rd");


    }


    @And("user press on login button")
    public void PressLoginBtn() throws InterruptedException {

        login.loginBtn.click();
        Thread.sleep(3000);
    }



    @Then("user login to the system successfully")
    public void verifyMsg(){
       String ActualResult= login.accountIcon.getText();
       String ExpectedResult = "My account";
        softAssert.assertEquals(ActualResult,ExpectedResult);

    }

    @Given("user go to login page invalid scenario")
    public void invalid_LoginPage() {
        login.LoginIcon.click();



    }


    @When("user login with invalid {string} and {string}")
    public void userLoginWithInvalidAnd(String Wrongemail, String WrongPass) {
        login.email.sendKeys(Wrongemail);
        login.pass.sendKeys(WrongPass);
    }

    @And("user press on login button invalid scenario")
    public void invalid_PressLoginBtn() throws InterruptedException {

        login.loginBtn.click();
        Thread.sleep(2000);
    }

    @Then("user could not login to the system")

    public void WrongLogin(){

        String ActualResult= login.WrongMsg.getText();
       String ExpectedResult = "Login was unsuccessful. Please correct the errors and try again.\n" +
               "No customer account found";
     softAssert.assertEquals(ActualResult,ExpectedResult);
    }
}
