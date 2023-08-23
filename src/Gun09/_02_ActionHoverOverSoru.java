package Gun09;

//     https://www.etsy.com/ sayfasına gidiniz.
//    Jewellery -> Neckless -> Bib Neckless click
//    tıklatma işleminden sonra URL de
//    bib-necklaces kelimesinin geçtiğini doğrulayın.

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class _02_ActionHoverOverSoru extends BaseDriver {

    @Test
    public void Test1(){
        driver.get("https://www.etsy.com/");

        List<WebElement> cookiesAccept= driver.findElements(By.xpath("//button[@class='wt-btn wt-btn--filled wt-mb-xs-0']"));
        if (cookiesAccept.size() > 0) // varsa
            cookiesAccept.get(0).click(); // kapat,tıklatarak

        WebElement mucevher=driver.findElement(By.id("catnav-primary-link-10855"));
        WebElement kolye=driver.findElement(By.id("side-nav-category-link-10873"));
        WebElement bibKolye=driver.findElement(By.id("catnav-l3-10881"));

        Actions aksiyonDriver=new Actions(driver);

        MyFunc.Bekle(2);
        aksiyonDriver.moveToElement(mucevher).build().perform();
        MyFunc.Bekle(2);
        aksiyonDriver.moveToElement(kolye).build().perform();
        MyFunc.Bekle(2);
        bibKolye.click();
        //aksiyonDriver.moveToElement(bibKolye).click().build().perform();

        MyFunc.Bekle(2);
        Assert.assertTrue("Bib Kolye kelimesi URL de bulunamadı", driver.getCurrentUrl().contains("bib") );

        BekleVeKapat();
    }




}
