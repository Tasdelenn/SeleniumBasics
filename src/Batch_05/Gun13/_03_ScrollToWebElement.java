package Batch_05.Gun13;

import Batch_05.Utlity.BaseDriver;
import Batch_05.Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class _03_ScrollToWebElement extends BaseDriver {

    @Test
    public void Test1() {
        driver.manage().deleteAllCookies(); // cookies leri sildik. accept her zaman çıksın diye
        driver.get("https://www.copado.com/robotic-testing");

        MyFunc.Bekle(2);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement element = driver.findElement(By.xpath("//a[text()='Read story']"));
        js.executeScript("arguments[0].scrollIntoView(true);", element);  // elemente kadar kaydır,

        //element.click();  tıklatma özelliğini kaybettiren elemntlerin altında olduğunda tıklanamaz
        js.executeScript("arguments[0].click();", element); // html içinden elemnte ulaşır ve tıklatır

        MyFunc.Bekle(5);
        BekleKapat();

    }
}
