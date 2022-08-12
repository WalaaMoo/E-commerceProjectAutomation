package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class P01_register {

    //constructor
    public  P01_register(){
        PageFactory.initElements(Hooks.driver,this);

    }

    @FindBy(className="ico-register")
    public WebElement registerBtn ;

    @FindBy(id = "gender-female")
    public  WebElement genderBtn ;

    @FindBy(id = "FirstName")
    public  WebElement firstname;

    @FindBy (id ="LastName")
    public WebElement lastname;



    @FindBy(name = "DateOfBirthDay")
    public  WebElement day;


    @FindBy(name = "DateOfBirthMonth")
    public  WebElement month;

    @FindBy(name = "DateOfBirthYear")
    public  WebElement year;


    @FindBy(id = "Email")
    public  WebElement email;

    @FindBy(id ="Password")
    public  WebElement pass;

    @FindBy(id ="ConfirmPassword")
    public  WebElement conPass;

    @FindBy(id ="register-button")
    public  WebElement regBtn;


    @FindBy(className ="result")
    public  WebElement ConfirmMsg;

    @FindBy(className = "ico-logout")

    public  WebElement LogoutIcon;

}
