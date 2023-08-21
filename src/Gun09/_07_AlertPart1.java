package Gun09;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _07_AlertPart1 extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");
        MyFunc.Bekle(3);

        WebElement clickMe1= driver.findElement(By.cssSelector("button[onclick='myAlertFunction()']"));
        clickMe1.click();

        MyFunc.Bekle(2);
        // alert açıldı.
        driver.switchTo().alert().accept();
        //alert kutusuna git ve OK ye bas. böylece kapanıyor.

        BekleVeKapat();
    }

}
