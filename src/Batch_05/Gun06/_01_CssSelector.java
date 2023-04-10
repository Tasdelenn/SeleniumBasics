package Batch_05.Gun06;

import Batch_05.Utlity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_CssSelector extends BaseDriver {
    // 1-Açılan sayfadaki kutucuğa mesajınızı yazını.
    // 2-Butona tıklatınız
    // 3-Butona basıldığında mesajınızın sayfada göründüğünü test ediniz.
    // Sadece cssSelector kullanınız

    public static void main(String[] args) {
        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        WebElement gelismis = driver.findElement(By.xpath("//button[@class='secondary-button small-link']"));
        gelismis.click();

        WebElement devamEt = driver.findElement(By.cssSelector("a#proceed-link"));
        devamEt.click();

        String mesajim = "merhaba selenium";
        WebElement txtBox = driver.findElement(By.cssSelector("input[id='user-message']"));
        txtBox.sendKeys(mesajim);

        WebElement btn = driver.findElement(By.cssSelector("[onclick='showInput();']"));
        btn.click();

        WebElement msg = driver.findElement(By.cssSelector("[id='display']"));

        if (msg.getText().equals(mesajim))
            System.out.println("test passed");
        else
            System.out.println("test fail");

        BekleKapat();
    }
}
