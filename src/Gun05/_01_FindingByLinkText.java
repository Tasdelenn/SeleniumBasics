package Gun05;

import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_FindingByLinkText {
//    id -> By.Id()
//    name -> By.name
//    class -> By.class
//
//    linkText ile partialLinkText  SADECE a taglerinde çalışır
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hepsiburada.com/");

        // linkText
        WebElement siparislerimLinki=driver.findElement(By.linkText("Siparişlerim"));
        System.out.println("siparislerimLinki.getText() = " + siparislerimLinki.getText());

        // partialLinkText
        WebElement link2=driver.findElement(By.partialLinkText("Süper Fiyat"));
        System.out.println("link2.getText() = " + link2.getText());

        System.out.println("siparislerimLinki.href = " + siparislerimLinki.getAttribute("href"));
        System.out.println("siparislerimLinki.title = " + siparislerimLinki.getAttribute("title"));
        System.out.println("siparislerimLinki.rel = " + siparislerimLinki.getAttribute("rel"));

        MyFunc.Bekle(5);
        driver.quit();
    }


}
