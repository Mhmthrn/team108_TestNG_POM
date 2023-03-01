package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class QdPage {
    public QdPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(linkText = "Log in")
    public WebElement ilkLoginLinki;


    @FindBy(id = "login-email")
    public WebElement emailKutusu;

    @FindBy(id = "login-password")
    public WebElement passwordKutusu;

    @FindBy(xpath = "//*[@id=\"cookieConsentContainer\"]/div[2]/a")
    public WebElement loginButonuoncesiCookie;


    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginButonu;

    @FindBy(linkText = "Instructor")
    public WebElement basariliGirisElementi;







}
