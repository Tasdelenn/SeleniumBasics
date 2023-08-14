package Gun05;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class _02_FindingElements_tag extends BaseDriver {
    public static void main(String[] args) {
//        DriverBaslat();
//
        driver.get("https://www.hepsiburada.com/");

        List<WebElement> linkler= driver.findElements(By.tagName("a"));
        // bütün a tag li elemetleri bul

        for(WebElement e: linkler){
            System.out.println("e.getText() = " + e.getText());
           // break;
        }

       BekleVeKapat();
    }


}
