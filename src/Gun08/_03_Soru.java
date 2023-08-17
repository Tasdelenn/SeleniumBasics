package Gun08;

//        Test Senaryosu
//        1- https://www.facebook.com/  sayfasına gidiniz
//        2- CreateNewAccount a tıklatınız.
//        3- Açılan yeni pencerede isim, soyisim ve emaili giriniz.
//        4- Doğum tarihinizi Select sınıfı ile seçiniz
//        5- Email i tekrar girmenizi isteyen bir input daha açıldığını
//          öncesinde de görünmediğini, sonrasında da göründüğünü
//          assert ile doğrulayınız.


import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _03_Soru extends BaseDriver {

    @Test
    public void Test1()
    {
        driver.get("https://www.facebook.com/");

        MyFunc.Bekle(2);
        List<WebElement> cookiesAccept=driver.findElements(By.xpath("//button[text()='Allow all cookies']"));
        if (cookiesAccept.size() > 0)
            cookiesAccept.get(0).click();




        BekleVeKapat();
    }

}
