package tests.day11_POM_assertions;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QdPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_NegatifLoginTesti {


    // qd adresine gidin
    // 3 test methodu olusturun
    // ve asagidaki durumlerda giris yapilamadigini test edin
    // 1- gecerli usernaem ,gecersiz paawor
    //2- gecersiz username, gecerli password
    //3- gecersizusetrname, gecersiz password


    @Test
    public void negatifLogin1() throws InterruptedException {
        QdPage qdPage=new QdPage();
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        qdPage.ilkLoginLinki.click();
        qdPage.emailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        qdPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecersizPassword"));
        qdPage.loginButonuoncesiCookie.click();
        qdPage.loginButonu.sendKeys(Keys.ENTER);

        Assert.assertTrue(qdPage.emailKutusu.isEnabled());
        Driver.closeDriver();

    }
    @Test
    public void negatifLogin2() throws InterruptedException {
        QdPage qdPage=new QdPage();
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        qdPage.ilkLoginLinki.click();
        qdPage.emailKutusu.sendKeys(ConfigReader.getProperty("qdGecersizUsername"));
        qdPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));
        qdPage.loginButonuoncesiCookie.click();
        qdPage.loginButonu.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        Assert.assertTrue(qdPage.emailKutusu.isEnabled());

        Driver.closeDriver();

    }

    @Test
    public void negatifLogin3(){
        QdPage qdPage=new QdPage();
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        qdPage.ilkLoginLinki.click();
        qdPage.emailKutusu.sendKeys(ConfigReader.getProperty("qdGecersizUsername"));
        qdPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecersizPassword"));
        //qdPage.loginButonuoncesiCookie.click();
        qdPage.loginButonu.sendKeys(Keys.ENTER);
        Assert.assertTrue(qdPage.emailKutusu.isEnabled());

        Driver.closeDriver();

    }

}
