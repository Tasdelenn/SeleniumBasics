package Batch_05.Gun13;

import Batch_05.Utlity.BaseDriver;
import Batch_05.Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class _04_RobotClass extends BaseDriver {

    @Test
    public void Test1() throws AWTException {
        driver.get("http://demo.guru99.com/test/upload/");
        MyFunc.Bekle(2);

        WebElement iframeDosyaSec = driver.findElement(By.name("__uspapiLocator"));
        driver.switchTo().frame(iframeDosyaSec); // name:  gdpr-consent-notice >> değişmiş

        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(12));
/**
         // acceptAll
        List<WebElement> acceptAll=
                wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//span[text()='Accept All']")));

        if (acceptAll.size() > 0)
            acceptAll.get(0).click();

        *************************************************************
 */
        Robot rbt= new Robot();

        for (int i = 0; i < 21 ; i++) {
            // MyFunc.Bekle(1);
            rbt.keyPress(KeyEvent.VK_TAB); // tuşa basıldı.  down
            rbt.keyRelease(KeyEvent.VK_TAB); // tuş bırakıldı
        }

        rbt.keyPress(KeyEvent.VK_ENTER); // tuşa basıldı.  down
        rbt.keyRelease(KeyEvent.VK_ENTER); // tuş bırakıldı

        // buraya kadar windows dosya bul açıldı
        // aşağıdaki bölüm dosyanın yolunu hafızaya kopyalıyor
        StringSelection dosyaYolu = new StringSelection("D:\\TECHNO_STUDY\\ornek.txt");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(dosyaYolu, null);

        MyFunc.Bekle(1);
        rbt.keyPress(KeyEvent.VK_CONTROL); // bu iki tuş şu anda basılmış vaziyette, hafızadaki yapıştırıldı
        rbt.keyPress(KeyEvent.VK_V);

        MyFunc.Bekle(1);
        rbt.keyRelease(KeyEvent.VK_CONTROL); // tuşlar serbest bırakıldı
        rbt.keyRelease(KeyEvent.VK_V);

        rbt.keyPress(KeyEvent.VK_ENTER); // dosya Entera basılarak gönderildi
        rbt.keyRelease(KeyEvent.VK_ENTER);

        MyFunc.Bekle(1);
        // checkBox gelindi
        for (int i = 0; i < 2 ; i++) {
            rbt.keyPress(KeyEvent.VK_TAB); // tuşa basıldı.  down
            rbt.keyRelease(KeyEvent.VK_TAB); // tuş bırakıldı
        }

        MyFunc.Bekle(1);
        rbt.keyPress(KeyEvent.VK_SPACE); // çeklendi
        rbt.keyRelease(KeyEvent.VK_SPACE);

        MyFunc.Bekle(1);
        // butona gelindi gelindi
        for (int i = 0; i < 2 ; i++) {
            rbt.keyPress(KeyEvent.VK_TAB); // tuşa basıldı.  down
            rbt.keyRelease(KeyEvent.VK_TAB); // tuş bırakıldı
        }

        MyFunc.Bekle(1);
        rbt.keyPress(KeyEvent.VK_ENTER); // enterlandı
        rbt.keyRelease(KeyEvent.VK_ENTER);

        ///////////////////// iFrame ////////////////////////////

        driver.switchTo().defaultContent(); // Aradığımız element ana frame de olduğu için default content'e geri çıktık.
        driver.switchTo().parentFrame();    // 1. Derinlikli olduğu için bi üst frame e bu şekilde çıksan da olur.

        ////////////////////////////////////////////////////////

        WebElement mesaj= wait.until(ExpectedConditions.
                visibilityOfElementLocated(By.xpath("//*[text()='has been successfully uploaded.']")));

        Assert.assertTrue(mesaj.isDisplayed());

        BekleKapat();
    }
}
