package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;
import java.util.List;

public class P03_homePage {

    public P03_homePage(){
        PageFactory.initElements(Hooks.driver,this);

    }

    @FindBy(xpath = "//*[@id=\"customerCurrency\"]/option[2]")
       public WebElement Euro;

    @FindBy(className = "price")
     public  List<WebElement> priceProducts;




    @FindBy(id ="small-searchterms")
    public  WebElement searchTxt;

    @FindBy(className ="search-box-button")
    public  WebElement searchBtn;

    @FindBy(css = "h2[class=\"product-title\"] a")
    public  List<WebElement> productResult;

    @FindBy(className = "picture")
    public  WebElement pictureIcon;

    @FindBy(className = "sku")
    public  WebElement Skufiled;

    @FindBy(xpath = "//ul[@class=\"top-menu notmobile\"]/li")
    public List<WebElement> mainCategory;


    @FindBy(className = "page-title")
    public  WebElement pageTitle;

    @FindBy(id = "nivo-slider")
    public  WebElement slidepage;

    @FindBy(xpath = "//*[@id=\"nivo-slider\"]/a[1]")
    public  WebElement secondSlide;


    @FindBy(className= "facebook")
    public WebElement facebook;

    @FindBy(className = "twitter")
    public WebElement twitter;

    @FindBy(className = "rss")
    public  WebElement rss;

    @FindBy(className = "youtube")
    public  WebElement youtube;


    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[2]/button[3]")
    public  WebElement wishBtn;

    @FindBy (className = "bar-notification success")
     public  WebElement NotifyMsg;

    @FindBy(className = "wishlist-label")
    public  WebElement wishlistLabel;

    @FindBy (className = "wishlist-qty")
    public  WebElement qty;
}
