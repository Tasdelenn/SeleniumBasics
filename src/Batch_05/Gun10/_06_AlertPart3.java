package Batch_05.Gun10;

import Batch_05.Utlity.BaseDriver;
import Batch_05.Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _06_AlertPart3 extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement clickMe2 = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        MyFunc.Bekle(2);
        clickMe2.click();

        MyFunc.Bekle(2);
        // alert açılıyor.
        driver.switchTo().alert().sendKeys("hakan");
        driver.switchTo().alert().accept();

        MyFunc.Bekle(2);
        WebElement txtActual = driver.findElement(By.id("prompt-demo"));

        Assert.assertTrue("Beklenen yazi gözükdü mü", txtActual.getText().contains("hakan"));
        BekleKapat();
    }
}