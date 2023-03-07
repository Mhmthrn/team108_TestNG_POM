package tests.day13_crossBrowserTests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C03_DataPovider {

    /*
        Verilen 4 farkli web sitesine gidin o sayfaya
        gidildigini test edin sayfayi kapatin

        amazon url
        wiseUrl
        qdUrl
        youtubeUrl
         */
    @DataProvider
    public static Object[][] urlListesi() {
        String [][] siteListesi={{"amazonUrl"},{"wiseUrl"},{"qdUrl"},{"youtubeUrl"}};
        return siteListesi;
    }

    @Test(dataProvider = "urlListesi")
    public void urlTest(String gidilecekSite){
        Driver.getDriver().get(ConfigReader.getProperty(gidilecekSite));
        ReusableMethods.bekle(2);

        String actualUrl=Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(actualUrl,ConfigReader.getProperty(gidilecekSite)+"/");

        Driver.closeDriver();
    }
}
