package tests.day12_xmlFiles;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

public class C02_ReusableMethodsSwitchingWindows {
    @Test
    public void switchingWindowsTesti(){

        //● https://the-internet.herokuapp.com/windows adresine gidin.
        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");

        // ● Click Here butonuna basın.
        Driver.getDriver().findElement(By.linkText("Click Here")).click();

        // ● Acilan yeni pencerenin sayfa başlığının (title) “New Window” oldugunu dogrulayin.
        ReusableMethods.switchToWindow("New Window");
        System.out.println(Driver.getDriver().getTitle());
        // ● Sayfadaki textin “New Window” olduğunu doğrulayın.
        // ● Bir önceki pencereye geri döndükten sonra sayfa başlığının “The Internet” olduğunu doğrulayın.


    }
}
