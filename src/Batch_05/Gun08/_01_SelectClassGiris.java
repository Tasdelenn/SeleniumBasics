package Batch_05.Gun08;

import Batch_05.Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Set;

public class _01_SelectClassGiris extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("https://www.amazon.com.tr/");

        // Önce tüm çerezler silinir
        driver.manage().deleteAllCookies();

        // Tüm çerezler alınır ve WebDriver'a eklenir
        Set<Cookie> cookies = driver.manage().getCookies();
        for (Cookie cookie : cookies) {
            driver.manage().addCookie(cookie);
        }

        WebElement webMenu1 = driver.findElement(By.id("searchDropdownBox"));

        // bu element select tag i ile başlıyorsa, sen bunu SELECT e cast yap ve öyle kullan.
        Select ddMenu1 = new Select(webMenu1); // elementi daha rahat kullanılabilir SELECT nesnesi haline dönüştürdü.
//        ddMenu1.selectByIndex(4); // ister bu şekilde seçebilirsin   : indexle
//        ddMenu1.selectByValue("search-alias=electronics"); // ister bu şekilde seçebilirsin : value ile
        ddMenu1.selectByVisibleText("Elektronik"); // ister bu şekilde seçebilirsin : görünen string ile

        System.out.println("ddMenu1.getOptions().size() = " + ddMenu1.getOptions().size());

        //Şimdi bu menudeki alt başlıkları yazdralım:
        List<WebElement> subList = ddMenu1.getOptions().subList(0, ddMenu1.getOptions().size());
        for (WebElement e : subList)
        {
            System.out.println(e.getText());
        }

        BekleKapat();
    }


}
