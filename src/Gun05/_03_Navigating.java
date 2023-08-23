package Gun05;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_Navigating extends BaseDriver {
    public static void main(String[] args) {
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");

        MyFunc.Bekle(3);
        WebElement element=driver.findElement(By.id("alerttest"));
        element.click(); // yeni sayfaya gitti.
        MyFunc.Bekle(3);

        System.out.println(driver.getCurrentUrl());  // o anda bulunduğun URL bilgisini verir

        driver.navigate().back();
        MyFunc.Bekle(3);
        System.out.println(driver.getCurrentUrl());  // o anda bulunduğun URL bilgisini verir

        driver.navigate().forward();
        MyFunc.Bekle(3);
        System.out.println(driver.getCurrentUrl());  // o anda bulunduğun URL bilgisini verir
        System.out.println(driver.getTitle());  // o anda bulunduğun TİTLE bilgisini verir


      BekleVeKapat();
    }
}
