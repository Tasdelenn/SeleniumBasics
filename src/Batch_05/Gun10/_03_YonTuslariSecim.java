package Batch_05.Gun10;

import Batch_05.Utlity.BaseDriver;
import Batch_05.Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _03_YonTuslariSecim extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("https://demoqa.com/auto-complete");

        WebElement txtBox = driver.findElement(By.id("autoCompleteSingleInput"));

        Actions aksiyonlar = new Actions(driver);
        // elemente git , içine tıklat, b tuşuna bas

        Action aksiyon = aksiyonlar
                .moveToElement(txtBox)    // elementin üzerine git
                .click()                  // e
                .sendKeys("b")
                .build();
        aksiyon.perform();

        // aksiyonlar.moveToElement(txtBox).click().sendKeys("b").build().perform();

        MyFunc.Bekle(2);

        aksiyon = aksiyonlar
                .sendKeys(Keys.DOWN)
                .sendKeys(Keys.ENTER)
                .build();
        aksiyon.perform();

        //aksiyonlar.sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
        BekleKapat();
    }
}
