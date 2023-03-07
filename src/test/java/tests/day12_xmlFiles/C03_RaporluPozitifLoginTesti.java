package tests.day12_xmlFiles;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QdPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C03_RaporluPozitifLoginTesti extends TestBaseRapor {
    @Test
    public void pozitifLoginTesti() throws InterruptedException {
        extentTest=extentReports.createTest("Pozitif Login Testi","Gecerli bilgilerle giris yapilabilmeli");
        // qd ana sayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        extentTest.info("Anasayfaya gidildi");
        // login linkine tiklayin
        QdPage qdPage=new QdPage();
        qdPage.ilkLoginLinki.click();
        extentTest.info("ilk Login Linki ne tilandi ");
        // gecerli kullanici adi ve password ile giris yapin
         qdPage.emailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        qdPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));
        qdPage.loginButonuoncesiCookie.click();
        extentTest.info("ilk Login Linki ne tiklandi ");
        Thread.sleep(2000);
        qdPage.loginButonu.sendKeys(Keys.ENTER);
        // basarili bir sekilde giris yapildigini test edin
        Assert.assertTrue(qdPage.basariliGirisElementi.isDisplayed());
        extentTest.pass("Basarili sekilde giris yapildigi test edildi");


    }
}
