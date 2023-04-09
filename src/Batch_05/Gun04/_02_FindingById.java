package Batch_05.Gun04;

import Batch_05.Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_FindingById {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353"); // sayfaya gittim

        WebElement isimKutusu = driver.findElement(By.id("first_8")); // İD ile elemanı bul
        isimKutusu.sendKeys("hakan"); // kutucuklara yazı gönderme

        WebElement soyadKutusu = driver.findElement(By.id("last_8"));
        soyadKutusu.sendKeys("tasdelen");

        MyFunc.Bekle(2);
//        isimKutusu.clear();
//        soyadKutusu.clear();

        // Chrome ctrl+f ye basıldığında inspect bölümünde
        // (inpect bölümü aktifken) arama kutusunu açar
        // first_name yazarsak bütün kelimelerde arar
        // #first_name yazarsak bütün ID paramtrelerinde arar

        WebElement labelFirstName = driver.findElement(By.id("sublabel_8_first"));
        System.out.println("labelFirstName.getText() = " + labelFirstName.getText());

        WebElement labelLastName = driver.findElement(By.id("sublabel_8_last"));
        System.out.println("labelLastName.getText() = " + labelLastName.getText());

        WebElement submitButton = driver.findElement(By.id("input_2"));
        submitButton.click();

        MyFunc.Bekle(3);
        driver.quit();
    }
}
