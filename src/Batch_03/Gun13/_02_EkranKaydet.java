package Batch_03.Gun13;

import Batch_03.Utils.BaseStaticDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

public class _02_EkranKaydet extends BaseStaticDriver {
    public static void main(String[] args) throws IOException {
        driver.get("https://opensource-demo.orangehrmlive.com/");

        WebElement username=driver.findElement(By.id("txtUsername"));
        username.sendKeys("ismet");
        WebElement password=driver.findElement(By.id("txtPassword"));
        password.sendKeys("mmmmm");
        WebElement btnLogin=driver.findElement(By.id("btnLogin"));
        btnLogin.click();

        List<WebElement> spanMessage=driver.findElements(By.id("spanMessage"));
        if (spanMessage.size()>0){ // login olamadın hata ekran görünütüsünü saklayalım
           // Hata ekranının ScreenShot ını alalım
            System.out.println("Login olamadı. Hata mesajı gözüktü");

            //Ekran görünütüsü alalım
            TakesScreenshot ts=(TakesScreenshot) driver; // 1.Aşama ekran görünütüsü alma değişkenini tanımladım
            File hafizadakiHali=ts.getScreenshotAs(OutputType.FILE);  // 2.Aşama Saklama tipi seçildi (Dosya), data(Veritabanı) (Byte)
            // hafizadakiHali -> dosya olarak(jpg,png,bmp) kaydedeceğiz.
            FileUtils.copyFile(hafizadakiHali, new File("ekranGoruntuleri/LoginKontrol.png"));
            // hafızadaki ekranDosyasi nı al bunu verdiğim yola ve isme kaydet.
            // jpg,bmp,gif ..
            // sistemden tarihi okuyabiliyormuyduk
            // yılaygunsaatdaksan
            // TODO : Ödev: buradaki dosya adını zamana bağlı hale getiriniz ki hep üstüne kaydetmesin
            LocalDateTime dateTime = LocalDateTime.now();

            String strDateTime = String.valueOf("" + dateTime.getYear() + dateTime.getMonthValue() +
                    dateTime.getDayOfMonth() + dateTime.getHour() + dateTime.getMinute() +
                    dateTime.getSecond());

            String pathName = "ekranGoruntuleri/" + strDateTime + ".png";
            System.out.println(pathName);
            FileUtils.copyFile(hafizadakiHali, new File(pathName));     //file utilities i kullanmak için commons-io-2.8.0.jar 'i import ettik library ye
            // mesala 20210526111201.jpg  gib...
        }





        BekleKapat();
    }
}
