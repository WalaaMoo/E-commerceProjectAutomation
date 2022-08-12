package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P02_Login {


    public  P02_Login(){

        PageFactory.initElements(Hooks.driver,this);
    }


    @FindBy(className = "ico-login")
     public WebElement LoginIcon;

    @FindBy(id = "Email")
    public WebElement email;


    @FindBy(id = "Password")
    public WebElement pass;

    @FindBy (className = "login-button")
    public  WebElement loginBtn;

    @FindBy(id = "small-searchterms")
    public WebElement search;

    @FindBy(className = "ico-account")
    public  WebElement accountIcon;

    @FindBy(className = "message-error")
    public  WebElement WrongMsg;
}
