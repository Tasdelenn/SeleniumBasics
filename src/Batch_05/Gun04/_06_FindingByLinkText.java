package Batch_05.Gun04;

import Batch_05.Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _06_FindingByLinkText {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hepsiburada.com/"); // sayfaya gittim

        // LinkText yoluyla eleman bulma işlemi sadece html <a> tag inde kullanılabilir.
        WebElement siparislerimLinki= driver.findElement(By.linkText("Siparişlerim")); // tam görünen link text ini vereceğiz
        // gözüken text i Siparişlerim olan a tag li webelement
        System.out.println("siparislerimLinki.getText() = " + siparislerimLinki.getText());

        System.out.println("siparislerimLinki.getAttribute(href) = " + siparislerimLinki.getAttribute("href"));
        System.out.println("siparislerimLinki.getAttribute(title) = " + siparislerimLinki.getAttribute("title"));
        System.out.println("siparislerimLinki.getAttribute(rel) = " + siparislerimLinki.getAttribute("rel"));

        // partialLinkText
        WebElement link2= driver.findElement(By.partialLinkText("Süper Fiyat")); // görünen link text inin bir parçası verilebiliyor
        System.out.println("link2.getText() = " + link2.getText());

        MyFunc.Bekle(3);
        driver.quit();
    }
}
