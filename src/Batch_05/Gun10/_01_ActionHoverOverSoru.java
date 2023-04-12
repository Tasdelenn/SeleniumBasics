package Batch_05.Gun10;

//    https://www.etsy.com/ sayfasına gidiniz.
//    Jewellery -> Neckless -> Bib Neckless click
//    tıklatma işleminden sonra URL de
//    bib-necklaces kelimesinin geçtiğini doğrulayın.

import Batch_05.Utlity.BaseDriver;
import Batch_05.Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class _01_ActionHoverOverSoru extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("https://www.etsy.com/");

        //    List<WebElement> cookiesAccept = driver.findElements(By.cssSelector("[class='wt-btn wt-btn--filled wt-mb-xs-0']"));
        //    if (cookiesAccept.size() > 0) // varsa
        //        cookiesAccept.get(0).click(); // kapat, tıklat

        WebElement mucevher = driver.findElement(By.id("catnav-primary-link-10855"));
        WebElement kolye = driver.findElement(By.id("side-nav-category-link-10873"));
        WebElement bibKolye = driver.findElement(By.id("catnav-l3-10881"));

        Actions aksiyonlar = new Actions(driver);

        aksiyonlar.moveToElement(mucevher).build().perform();
        MyFunc.Bekle(2); // gözükene kadar bekle diyeceğiz yarın
        aksiyonlar.moveToElement(kolye).build().perform();
        MyFunc.Bekle(2);
        aksiyonlar.moveToElement(bibKolye).click().build().perform();  //bibKolye.click();

        MyFunc.Bekle(2);
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        // hata varsa söyle
        Assert.assertTrue
                (
                        "Url de bib Kolye varmı",
                        driver.getCurrentUrl().contains("bib-necklaces")   // beklentiyi yazıyorum
                );

        BekleKapat();
    }
}
