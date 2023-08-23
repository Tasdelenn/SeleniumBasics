package Gun10;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/*
    Interview Sorusu : Implicit ve Explicit

    Implicitli  : Bütün elemanlar için geçerli,Bir kere tanımlanır. (HTML de verilen locator var mı?)
    Explicit    : Tek bir elemana özel Kriter olarak tanımlanır sadece ilgili elemanda geçerli olur

    Her ikisi de tanımlı ise hangisinin süresi kullanılır ?
                            önce Implicit kullanılır, ve üzerine Explicit in süresi eklenerek
                            toplam hata sınırı süresi (mühlet sınırı) ortaya çıkmış olur.
 */



public class _03_ExplicitWait extends BaseDriver {
    // ExplicitWait
    @Test
    public void Test1()
    {
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

        WebElement btn= driver.findElement(By.xpath("//button[@onclick='timedText()']"));
        btn.click();

        // text i "Web Driver" olana kadar bekle
        // Bu durumda elemente özel kriter vermek gerekir.
        WebDriverWait bekle=new WebDriverWait(driver, Duration.ofSeconds(5)); // 1 kere tanılanıyor
        // Duration gibi sadece süre ve driver tanımlaması yapıldı.
        //bekle.until(ExpectedConditions.textToBe(By.id("demo"), "WebDriver"));
        bekle.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
        // visibilityOfElementLocated : bu locator gözükene kadar BEKLE

        WebElement msj=driver.findElement(By.id("demo"));
        System.out.println("msj.getText() = " + msj.getText());

        BekleVeKapat();
    }

}
