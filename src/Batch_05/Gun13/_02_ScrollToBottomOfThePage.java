package Batch_05.Gun13;

import Batch_05.Utlity.BaseDriver;
import Batch_05.Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

public class _02_ScrollToBottomOfThePage extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("https://p-del.co/");
        MyFunc.Bekle(2);

        JavascriptExecutor js=(JavascriptExecutor)driver;

        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        //sayfanın sonuna kadar kaydırır.
        MyFunc.Bekle(2);

        js.executeScript("window.scrollTo(0, 0);"); // en başa direk gidiyor 0 noktasına git.

        //js.executeScript("window.scrollBy(0, 0);");  // bulunduğu yerden 0 kadar gider

        BekleKapat();
    }
}
