package Gun09;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _04_ActionTusKontrolSendKeys extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("https://demoqa.com/auto-complete");

        WebElement txtBox=driver.findElement(By.id("autoCompleteMultipleContainer"));
        MyFunc.Bekle(3);

        new Actions(driver)
                .moveToElement(txtBox)  // kutucuğa gel
                .click()                // içine tıklat
                .keyDown(Keys.SHIFT)    // shift e bas
                .sendKeys("a")          // "a" harfini gönder
                .keyUp(Keys.SHIFT)      // shift i bırak
                .sendKeys("hmet")       // "hmet" kalan ismi gönder
                .build()                // aksiyonu hazırla
                .perform();             // işlemi gerçekleştir.

        BekleVeKapat();
    }



}
