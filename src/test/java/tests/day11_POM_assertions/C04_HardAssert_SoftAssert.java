package tests.day11_POM_assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C04_HardAssert_SoftAssert {

    @Test
    public void hardAssertionTesti(){
        Assert.assertTrue(15>8);//

        Assert.assertFalse(8==9);//

        Assert.assertEquals(5,9);//

        Assert.assertNotEquals(6,6);//
    }


    @Test
    public  void softAssertionTesti(){
        /*
        JUniat deki assert clasi testNG de de varrdir ancak birden fazla failed olan assertion
        varsa ilk failed olan assertion da calismayi dururup exception firlattigindan tum hatayi bir
        defada gorup hepsini duzeltme sansimiz olmaz

        TestNG bunun icin alternatif olusturmustur
        Bu alternatif de assert clasindaki statik methodlari kullanmak yerine

        SoftAssert clasindan bi robje olusturup o obje uzerinden testlerimizxi yapiyoruz
        softassert objesi ile yapilan assertionlar failed olsa da testimiz calismaya devam eder
        ancak teslerin sonucunu gormek istedigimizde

        softassert.assertAll() ile tum yaptigi testleri raparlamasini soyleyebiliriz

        assertAll() methodunun calistigi satirda exception olabilir
         */
        SoftAssert softAssert=new SoftAssert();


       softAssert.assertTrue(5>8,"true testi failed oldu");//
       softAssert.assertFalse(8==8,"false testi failed oldu");//
       softAssert.assertEquals(5,9,"Equals testi failed oldu");//
       softAssert.assertNotEquals(6,6,"NotEquals testi failed oldu");//


        softAssert.assertAll();

    }


}
