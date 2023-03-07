package tests.day13_crossBrowserTests;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.QdPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C04_DataProviderNegatifLoginTest {


    /*
    verilen 5 farkli user name ve passwordu kullanarak qualityDemy uygulamasina girilemedigini test edin

     */

    @DataProvider
    public static Object[][] kullanicilar() {
       String [][] kullaniciList={{"Ahmet","14758"},{"Mehmet", "8569"},{"Meryem","874569"},{"Hakki","78546"},{"Kerem","8795"}};
       return kullaniciList;
    }

   @Test(dataProvider = "kullanicilar")
    public void negatifLogin(String username, String password){
        QdPage qdPage=new QdPage();
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        qdPage.ilkLoginLinki.click();

        qdPage.emailKutusu.sendKeys(username);
        qdPage.passwordKutusu.sendKeys(password);
        qdPage.loginButonuoncesiCookie.click();
       ReusableMethods.bekle(2);
        qdPage.loginButonu.click();
        Assert.assertTrue(qdPage.emailKutusu.isEnabled());

        Driver.closeDriver();

    }
}
