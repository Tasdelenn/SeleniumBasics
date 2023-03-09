package Batch_03.Gun08;

import Batch_03.Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _05_AlertPart2 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement clicMe2=driver.findElement(By.cssSelector("[class='btn btn-default btn-lg']"));
        clicMe2.click();

        Bekle(4);
        driver.switchTo().alert().dismiss(); // Alert kutucuğuna geçildi ve CANCEL(iptal) butonun basıldı.
        Bekle(2);
        //kapattığında sayfa dönmüş oluyorsun.
        BekleKapat();
    }
}
