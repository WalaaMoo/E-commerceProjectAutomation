package org.example.stepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

public class D01_registerStepDef {

    P01_register register = new P01_register();
    SoftAssert softAssert = new SoftAssert();

    @Given("user go to register page")

    public void registerPage (){

    register.registerBtn.click();

    }

    @When("user select gender type")
    public  void genderType(){
    register.genderBtn.click();


    }

    @And("user enter first name {string} and last name {string}")
    public void userEnterFirstNameAndLastName(String firstname, String secondname) {
        register.firstname.sendKeys(firstname);
        register.lastname.sendKeys(secondname);
    }


    @And("user enter date of birth")
    public  void birthdate(){
      Select day = new Select(register.day);
      day.selectByValue("10");

      Select month = new Select(register.month);
         month.selectByValue("8");

        Select year = new Select(register.year);
        year.selectByValue("1920");



    }


    @And("user enter email field")
    public void userEnterEmailField() throws IOException {
        Faker fake = new Faker();
        String email = fake.internet().safeEmailAddress();
        ConfigurationReader.set("email",email);
        System.out.println("the email address is" + email);
        register.email.sendKeys(email);

    }

    @And("user fills Password fields")
    public  void userEnterPassward(){
     register.pass.sendKeys("P@ssw0rd");
     register.conPass.sendKeys("P@ssw0rd");

    }


    @And("user clicks on register button")
    public void pressRegisterBtn(){

        register.regBtn.click();

    }

    @Then("success message is displayed")
    public  void ConfirmMsg() throws InterruptedException {
      String RegMsg = register.ConfirmMsg.getText();
      String ExpectedResult ="Your registration completed";
        softAssert.assertEquals(RegMsg,ExpectedResult);


        Thread.sleep(2000);

    }



}
