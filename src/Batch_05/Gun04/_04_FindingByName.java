package Batch_05.Gun04;

import Batch_05.Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _04_FindingByName {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353"); // sayfaya gittim

        WebElement ad=driver.findElement(By.name("q8_name[first]"));
        ad.sendKeys("hakan");

        MyFunc.Bekle(3);
        driver.quit();
    }
}
