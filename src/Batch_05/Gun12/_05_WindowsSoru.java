package Batch_05.Gun12;

/*
    Senaryo:
    https://www.selenium.dev/ adresindeki ayrı tab da açılan linklere tıklatınız.
    Açılan bütün yeni tablardaki sayfaların title ve url lerini yazdırınız.
    Daha sonra Anasayfa harici diğer tüm sayfaları kapatınız.
 */

import Batch_05.Utlity.BaseDriver;
import Batch_05.Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _05_WindowsSoru extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("https://www.selenium.dev/");
        MyFunc.Bekle(2);
        String anaSayfaWindowId= driver.getWindowHandle();

        List<WebElement> linkler= driver.findElements(By.cssSelector("a[target='_blank']"));

        // Aşağıdaki şu anda bütün sayfalar açıldı
        for(WebElement link: linkler)
            if (!link.getAttribute("href").contains("mail"))
                link.click();

        // her bir sayfaya geçip url ve title ını yazdırma
        Set<String> windowsIdLer= driver.getWindowHandles();
        for(String id: windowsIdLer)
        {
            MyFunc.Bekle(2);
            driver.switchTo().window(id); // sıradaki tabdaki window a geçmiş oldum.
            System.out.println("title="+ driver.getTitle()+", url="+driver.getCurrentUrl());
        }

        // ana sayfa harici kapama
        for(String id: windowsIdLer)
        {
            if (id.equals(anaSayfaWindowId))
                continue;

            driver.switchTo().window(id); // sıradaki tabdaki window a geçmiş oldum.
            driver.close();
        }

        BekleKapat();
    }
}
