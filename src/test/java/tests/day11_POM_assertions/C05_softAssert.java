package tests.day11_POM_assertions;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C05_softAssert {

    @Test
    public void amazonTessti(){
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        String expectedIcerik="amazon";
        String actualUrl=Driver.getDriver().getCurrentUrl();

        SoftAssert softAssert=new SoftAssert();

        softAssert.assertTrue(actualUrl.contains(expectedIcerik),"url amazon icermiyor");


        AmazonPage amazonPage=new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("nutella"+ Keys.ENTER);

        expectedIcerik="Nutella";
        String actualAramaSonucYazisi=amazonPage.aramaSonucElementi.getText();

        softAssert.assertTrue(actualAramaSonucYazisi.contains(expectedIcerik),"arma sonucu nutella icermiyor");


        amazonPage.ilkUrun.click();
        String actualIlkurunIsim=amazonPage.ilkUrunIsimElementi.getText();

        softAssert.assertTrue(actualIlkurunIsim.contains(expectedIcerik));






        softAssert.assertAll();
        Driver.closeDriver();
    }
}
