package Batch_05.Gun12;

import Batch_05.Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_IFrameGiris extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("https://chercher.tech/practice/frames");

        // id=frame1   name=iamframe   index?: bulunduğu sayfadaki kod sırası
        driver.switchTo().frame(0); // name ve id oldukça yavaş çalışıyor, index hızlı: index>name>id
        //driver.switchTo().frame("frame1");
        //driver.switchTo().frame("iamframe");

        WebElement input = driver.findElement(By.cssSelector("b[id='topic']+input"));
        input.sendKeys("Türkiye");

        // iframe içindeki bir locator da işlem yapılacaksa önce o iframe geçmem lazım.
        // driver.switchTo().frame(0);  // ilgili odaya (iframe) geç
        // driver.switchTo().parentFrame(); // bir önceki odaya geç, parent e geç
        // driver.switchTo().defaultContent(); // ilk ana sayfaya direk geçer

        BekleKapat();
    }
}
