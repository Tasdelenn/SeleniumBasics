package Gun09;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _09_AlertPart3 extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");
        MyFunc.Bekle(3);

        WebElement clickMe3= driver.findElement(By.xpath("//*[@onclick='myPromptFunction()']"));
        clickMe3.click();// alert açıldı.

        MyFunc.Bekle(2);
        driver.switchTo().alert().sendKeys("ismet"); //alert kutusuna git ve "ismet" yazısını gönder.
        driver.switchTo().alert().accept(); // alert kapatıldı

        MyFunc.Bekle(2);
        WebElement txtActual= driver.findElement(By.id("prompt-demo"));

        Assert.assertTrue("Beklenen yazı gözükmedi", txtActual.getText().contains("ismet"));

        BekleVeKapat();
    }


}
