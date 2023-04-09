package Batch_05.Gun04;

import Batch_05.Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _05_FindingByClassName {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353"); // sayfaya gittim

        WebElement name= driver.findElement(By.className("form-textbox"));
        name.sendKeys("hakan");
        // birden fazla aynı locator a sahip eleman bulursa findElement ne yapar ?
        // cevap : ilk element i bulur

        List<WebElement> labels=driver.findElements(By.className("form-sub-label"));
        System.out.println(labels.size());

        for (WebElement e: labels)
            System.out.println("e.getText() = " + e.getText());

        // aranılan eleman bulunamazsa : findElement NoSuchElement hatası veriri
        // findElements is size ı 0 olan List verir, yani hata vermez.

        MyFunc.Bekle(3);
        driver.quit();
    }
}
