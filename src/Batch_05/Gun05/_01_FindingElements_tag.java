package Batch_05.Gun05;

import Batch_05.Utlity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _01_FindingElements_tag extends BaseDriver {

    public static void main(String[] args) {
         driver.get("https://www.hepsiburada.com/");

         List<WebElement> linkler= driver.findElements(By.tagName("a")); // a tag ile başlayan tüm elemanları bul
         // verilen tag lerdeki tüm elemanları aldık

        for(WebElement e: linkler)
        {
            if (e.getText().isEmpty()) {
                System.out.print(" (href) = " + e.getAttribute("href"));
                System.out.print(" (title) = " + e.getAttribute("title"));
                System.out.println(" (rel) = " + e.getAttribute("rel"));
            }
        }

         BekleKapat();
    }


}
