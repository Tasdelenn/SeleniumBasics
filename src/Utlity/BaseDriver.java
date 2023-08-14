package Utlity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class BaseDriver {
    public static WebDriver driver; // SingletonDriver method

    public static void DriverBaslat(){
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // 30 sn mühlet: sayfayı yükleme mühlet
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  // 30 sn mühlet: elementi bulma mühleti
    }

    public static void BekleVeKapat(){
        MyFunc.Bekle(5);
        driver.quit();
    }

}
