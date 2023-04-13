package Batch_05.Gun11;

/*
Bu siteye gidiniz.  http://demo.seleniumeasy.com/ajax-form-submit-demo.html
        Name giriniz.
        Comment giriniz.
        Submit'e tıklayınız.
        Form submited Successfully! yazısı görüntülenmelidir.
        assert ile kontrol ediniz
        (xpath kullanmayınız)
 */


import Batch_05.Utlity.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _03_FillingFormTask extends BaseDriver {

    @Test
    public void Wait1(){
        driver.get("http://demo.seleniumeasy.com/ajax-form-submit-demo.html");

        WebElement title=driver.findElement(By.id("title"));
        title.sendKeys("hakan");

        WebElement description=driver.findElement(By.id("description"));
        description.sendKeys("taşdelen");

        WebElement submit=driver.findElement(By.id("btn-submit"));
        submit.click();

        // imlicitlyWait elemanın locator bulması süresiyle ilgili buradaki zaten elemanlar hemen bulunuyor
        // burada kriter bulunan elemanın görünen yazısının oluşma süresi
        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); // findElement

        WebDriverWait bekle= new WebDriverWait(driver, Duration.ofSeconds(30));
        bekle.until(ExpectedConditions.textToBe(By.id("submit-control"), "Form submited Successfully!"));

        WebElement mesaj=driver.findElement(By.id("submit-control"));
        Assert.assertEquals("Form submited Successfully!", mesaj.getText());

        BekleKapat();
    }
}
