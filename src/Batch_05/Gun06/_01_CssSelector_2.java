package Batch_05.Gun06;

import Batch_05.Utlity.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_CssSelector_2 extends BaseDriver {

    @Test
    public void Test1() {
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

        String kutuIcindeYazi = txtBox.getAttribute("value");
        System.out.println(kutuIcindeYazi);

        //Assert.assertTrue("aranılan mesaj bulunamadi", msg.getText().equals(mesajim)  ); // beklenen expect
        Assert.assertEquals("aranılan mesaj bulunamadi", msg.getText(), mesajim);
        // assertTrue: içindeki değer True mu ? True ise hiç bir şey yapmaz.mesaj vermez
        // değilse beklenen olmamışsa hata mesajı verir.
        //yani genel kural : Hata var ise göster

        BekleKapat();
    }

}
