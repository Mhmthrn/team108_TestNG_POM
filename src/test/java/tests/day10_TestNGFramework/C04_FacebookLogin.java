package tests.day10_TestNGFramework;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacabookPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class C04_FacebookLogin {

    @Test(groups = "smoke")
    public void facebookTesti(){
        FacabookPage facabookPage=new FacabookPage();
        //1 - https://www.facebook.com/ adresine gidin
        Driver.getDriver().get("https://www.facebook.com/");
        //2- POM’a uygun olarak email, sifre kutularini ve giris yap butonunu locate edin

        // cookies kabul et
        facabookPage.cookiesKabulButonu.click();

        //3- Faker class’ini kullanarak email ve sifre degerlerini yazdirip, giris butonuna basin
        Faker faker=new Faker();


        facabookPage.emailButonu.sendKeys("abc."+faker.internet().emailAddress());
        facabookPage.passwordButonu.sendKeys(faker.internet().password());
        facabookPage.loginButonu.click();
        //4- Basarili giris yapilamadigini test edin
        //4- Basarili giris yapilamadigini test edin

        Assert.assertTrue(facabookPage.girisYapilamadiYaziElementi.isDisplayed());

        ReusableMethods.bekle(3);

        Driver.closeDriver();
    }
}
