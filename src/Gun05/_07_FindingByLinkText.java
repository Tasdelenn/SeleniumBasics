package Gun05;

import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _07_FindingByLinkText {
    //    id -> By.Id()
//    name -> By.name
//    class -> By.class
//
//    linkText ile partialLinkText  SADECE a taglerinde çalışır
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hepsiburada.com/");

        WebElement siparislerimLinki=driver.findElement(By.linkText("Siparişlerim"));
        System.out.println("siparislerimLinki.getText() = " + siparislerimLinki.getText());




        MyFunc.Bekle(5);
        driver.quit();
    }


}
