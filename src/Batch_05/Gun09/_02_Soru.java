package Batch_05.Gun09;

/**
 * Test Senaryosu
 * 1- https://www.facebook.com/  sayfasına gidiniz
 * 2- CreateNewAccount a tıklatınız.
 * 3- Açılan yeni pencerede isim, soyisim ve emaili giriniz.
 * 4- Doğum tarihinizi Select sınıfı ile seçiniz
 * 5- Email i tekrar girmenizi isteyen bir input daha açıldığını
 * öncesinde de görünmediğini, sonrasında da göründüğünü
 * assert ile doğrulayınız.
 */

import Batch_05.Utlity.BaseDriver;
import Batch_05.Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class _02_Soru extends BaseDriver {

    @Test
    public void Test1() {
        //   driver.get("https://www.facebook.com/");


        //    MyFunc.Bekle(2);
        //    List<WebElement> cookiesAccept = driver.findElements(By.xpath("//button[text()='Allow essential and optional cookies']"));
        //    if (cookiesAccept.size() > 0)
        //        cookiesAccept.get(0).click();
/**
 MyFunc.Bekle(2);
 WebElement btnYeniHesap = driver.findElement(By.linkText("Yeni hesap oluştur"));
 btnYeniHesap.click();

 MyFunc.Bekle(1);
 WebElement firstname = driver.findElement(By.name("firstname"));
 firstname.sendKeys("Hakan");

 MyFunc.Bekle(1);
 WebElement lastname = driver.findElement(By.name("lastname"));
 lastname.sendKeys("Tasdelen");

 MyFunc.Bekle(1);
 WebElement reEmail = driver.findElement(By.name("reg_email_confirmation__"));
 Assert.assertFalse(reEmail.isDisplayed());  // beklenen görünmemesi false
 System.out.println("reEmail.isDisplayed() = " + reEmail.isDisplayed());

 MyFunc.Bekle(1);
 WebElement email = driver.findElement(By.xpath("reg_email__"));
 email.sendKeys("hkntsdln@hotmail.com");

 MyFunc.Bekle(1);
 Assert.assertTrue(reEmail.isDisplayed()); // beklenen görünmesi
 System.out.println("reEmail.isDisplayed() = " + reEmail.isDisplayed());

 MyFunc.Bekle(1);
 WebElement webDay = driver.findElement(By.id("day"));
 Select day = new Select(webDay);
 day.selectByVisibleText("07");

 MyFunc.Bekle(1);
 WebElement webMonth = driver.findElement(By.id("month"));
 Select month = new Select(webMonth);
 month.selectByValue("01");

 MyFunc.Bekle(1);
 WebElement webYear = driver.findElement(By.id("year"));
 Select year = new Select(webYear);
 year.selectByVisibleText("1979");

 BekleKapat();
 */

        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));

        WebElement btnYeniHesap = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText("Yeni hesap oluştur"))));
        btnYeniHesap.click();

        WebElement firstName = driver.findElement(By.name("firstname"));
        WebElement lastName = driver.findElement(By.name("lastname"));
        WebElement mobileOrEmail = driver.findElement(By.name("reg_email__"));
        WebElement secondEmailField = driver.findElement(By.name("reg_email_confirmation__"));
        WebElement password = driver.findElement(By.name("reg_passwd__"));
        WebElement signUpButton = driver.findElement(By.name("websubmit"));

        firstName.sendKeys("Haqan");
        lastName.sendKeys("Dashdelen");
        password.sendKeys("password123");

        MyFunc.Bekle(1);
        Assert.assertFalse(secondEmailField.isDisplayed());  // ÖNCE >> beklenen görünmemesi false
        System.out.println("reEmail.isDisplayed() = " + secondEmailField.isDisplayed());

        mobileOrEmail.sendKeys("hqndshdln@example.com");

        secondEmailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("reg_email_confirmation__")));

        MyFunc.Bekle(1);
        Assert.assertTrue(secondEmailField.isDisplayed()); // SONRA >> beklenen görünmesi
        System.out.println("reEmail.isDisplayed() = " + secondEmailField.isDisplayed());

        secondEmailField.sendKeys("hqndshdln@example.com");

        WebElement dayDropdown = driver.findElement(By.id("day"));
        Select daySelect = new Select(dayDropdown);
        daySelect.selectByValue("7");

        WebElement monthDropdown = driver.findElement(By.id("month"));
        Select monthSelect = new Select(monthDropdown);
        monthSelect.selectByValue("1");

        WebElement yearDropdown = driver.findElement(By.id("year"));
        Select yearSelect = new Select(yearDropdown);
        yearSelect.selectByValue("1979");

        WebElement genderMale = driver.findElement(By.xpath("//input[@name='sex' and @value='2']"));
        genderMale.click();
        signUpButton.click();

        BekleKapat();
    }
}
