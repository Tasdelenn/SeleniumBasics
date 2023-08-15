package Gun06;

import Utlity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.junit.Assert;
import org.junit.Test;

public class _03_CssSelectorTest extends BaseDriver {

    @Test  // sen test sin.main e ihtiyacın yok
    public void Test1()
    {
        driver.get("http://demo.seleniumeasy.com/basic-first-form-demo.html");

        String mesaj="merhaba selenium";
        WebElement txtBox=driver.findElement(By.cssSelector("input[id='user-message']"));
        txtBox.sendKeys(mesaj);

        WebElement btn=driver.findElement(By.cssSelector("[onclick='showInput();']"));
        btn.click();

        WebElement msg=driver.findElement(By.cssSelector("[id='display']"));

        Assert.assertTrue("Aranılan mesaj bulunamadı", msg.getText().contains(mesaj)); // içindeki TRUE mu değil mi
        // TRUE is ehiç mesaj verme , değilse hata mesajı ver

        BekleVeKapat();
    }



}
