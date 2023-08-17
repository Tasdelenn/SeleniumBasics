package Gun08;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _05_ActionClickTest extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("https://demoqa.com/buttons");

        WebElement btnClick = driver.findElement(By.xpath("//button[text()='Click Me']"));
        //element.click()

        Actions aksiyonlar = new Actions(driver);// web sayfası aksiyonlara açıldı.

        Action aksiyon = aksiyonlar.moveToElement(btnClick).click().build();
        // elementin üzerin click için git orda bekle.aksiyonu hazırla.
        System.out.println("Aksiyon hazırlandı");

        MyFunc.Bekle(4);
        aksiyon.perform(); // aksiyon gerçekleşiyor. işleme al, uygula.
        System.out.println("aksiyon gerçekleşti");

        // kısa hali.
        //aksiyonlar.moveToElement(element).click().build().perform();

        BekleVeKapat();
    }


}
