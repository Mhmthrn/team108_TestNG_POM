package tests.day10_TestNGFramework;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class C01_Priorty {

    /*
    testNg methodlari calistiriken standart olarak harf sirasina bakar

    ancak testnh siralalmayi kontrol itmemize olanak tanir


    istedigimiz metyhoda istedigimiz priority i ile tanimlayabiliriz
    Selenium test methodlari kucukten buyuge dogru calistiririr

    oncelik derecesi ayni oilani alfabetik siraya gore calistirir

    jpriorty dedegeri yazilmazsa default oalrak 0 olarak kabul edilir.
     */


    @Test(priority = 30)
    public  void amazonTesti(){
        // amazon ana sayfaya gidip . amazona gittigimizi test edelim
        Driver.getDriver().get("https://amazon.com");

        //url amazon iceriyor mu test edelim

        String expectedIcerik= "amazon";
        String actualURL=Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualURL.contains(expectedIcerik));

        Driver.closeDriver();



    }

    @Test(priority = 20)
    public  void wiseTesti() throws InterruptedException {
        Driver.getDriver().get("https://wisequarter.com");

        //url wisequarter iceriyor mu test edelim

        String expectedIcerik= "wisequarter";
        Thread.sleep(2000);
        Driver.driver.navigate().refresh();
        String actualURL=Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualURL.contains(expectedIcerik));

        Driver.closeDriver();


    }

    @Test(priority =10)
    public  void youtubeTesti(){
        // youtube ana sayfaya gidip . youtube gittigimizi test edelim
        Driver.getDriver().get("https://youtube.com");

        //url youtube iceriyor mu test edelim

        String expectedIcerik= "youtube";
        String actualURL=Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualURL.contains(expectedIcerik));

        Driver.closeDriver();
    }



}
