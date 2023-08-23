package Gun05;

import Utlity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _04_GetCssValue extends BaseDriver {
    public static void main(String[] args) {
        driver.get("https://www.snapdeal.com/");

        WebElement inputValEnter=driver.findElement(By.id("inputValEnter"));

        // elemanın attribute larına ulaşmak için getAttribute u kullanıyoruz.
        System.out.println("inputValEnter.getAttribute(class) = " + inputValEnter.getAttribute("class"));

        // Class ı n karşığı olan CSS-Şekillendirme değerlerini almak için getCssValue kullanılır
        System.out.println("inputValEnter.getCssValue(color) = " + inputValEnter.getCssValue("color"));
        System.out.println("inputValEnter.getCssValue(font-size) = " + inputValEnter.getCssValue("font-size"));
        System.out.println("inputValEnter.getCssValue(background) = " + inputValEnter.getCssValue("background"));


        BekleVeKapat();
    }
}
