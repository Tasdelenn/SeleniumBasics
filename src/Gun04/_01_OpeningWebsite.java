package Gun04;

import Utlity.MyFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_OpeningWebsite {
    public static void main(String[] args) {

        // oop WebDriver:Interface,Parent Class        ChromeDriver,FirefoxDriver,EdgeDriver:  child class
        WebDriver driver = new ChromeDriver(); // driver = browser, tarayıcı
//        WebDriver driver2= new FirefoxDriver();
//        WebDriver driver3= new EdgeDriver();

        driver.get("https://techno.study/tr"); //  web sayfasını açma


        MyFunc.Bekle(3);
        //driver.close(); // o anda aktif olan açık tarayıcıyı kapatıyor,
        // hafızadan siliyor
        driver.quit(); // program çalışırken açılmış bütün tarayıcıları
        // hem kapatıp hem de hafızadan siler
    }
}
