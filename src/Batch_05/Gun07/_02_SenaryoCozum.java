package Batch_05.Gun07;

import Batch_05.Utlity.BaseDriver;
import Batch_05.Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _02_SenaryoCozum extends BaseDriver {

    @Test
    public void Test1()
    {
        driver.get("https://www.saucedemo.com/");

        WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
        username.sendKeys("standard_user");

        MyFunc.Bekle(1);
        WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("secret_sauce");

        MyFunc.Bekle(1);
        WebElement loginButton=driver.findElement(By.xpath("//input[@id='login-button']"));
        loginButton.click();

        //1.Ürün Ekleme
        MyFunc.Bekle(2);
        WebElement product1=driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
        product1.click();

        MyFunc.Bekle(2);
        WebElement addToCart=driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
        addToCart.click();

        MyFunc.Bekle(2);
        WebElement btnBack=driver.findElement(By.xpath("//button[@id='back-to-products']")); //   //button[text()='Back to products']
        btnBack.click();


        //2.Ürün Ekleme
        MyFunc.Bekle(2);
        WebElement product2=driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']"));
        product2.click();

        MyFunc.Bekle(2);
        WebElement addToCart2=driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']"));  //*[ text()='Add to cart']
        addToCart2.click();

        MyFunc.Bekle(2);
        WebElement btnBack2=driver.findElement(By.xpath("//button[@id='back-to-products']")); //   //button[text()='Back to products']
        btnBack2.click();

        // sepet işlemleri
        MyFunc.Bekle(2);
        WebElement sepet=driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        sepet.click();

        MyFunc.Bekle(2);
        WebElement buttonCheckOut=driver.findElement(By.xpath("//button[@id='checkout']"));
        buttonCheckOut.click();

        // kullanıcı bilgileri giriyoruz
        MyFunc.Bekle(1);
        WebElement firstname=driver.findElement(By.xpath("//input[@id='first-name']"));
        firstname.sendKeys("Hakan");

        MyFunc.Bekle(1);
        WebElement lastname=driver.findElement(By.xpath("//input[@id='last-name']"));
        lastname.sendKeys("Tasdelen");

        MyFunc.Bekle(1);
        WebElement zipcode=driver.findElement(By.xpath("//input[@id='postal-code']"));
        zipcode.sendKeys("5553146789");

        MyFunc.Bekle(1);
        WebElement btnContinue=driver.findElement(By.xpath("//input[@id='continue']"));
        btnContinue.click();

        // ürün ücret toplamlarının testi
        List<WebElement> ucretler=driver.findElements(By.xpath("//div[@class='inventory_item_price']"));

        double toplam=0;
        for(WebElement e: ucretler){
            //System.out.println("e.getText() = " + e.getText()); // $29.99 -> e.getText().substring(1) -> 29.99
            //  replaceAll ile [^0-9.,]
            toplam = toplam + Double.parseDouble(  e.getText().substring(1) ); // 1 den itibaren sonuna kadar al
        }
        System.out.println("toplam = " + toplam);

        //alttoplam
        WebElement webAltToplam=driver.findElement(By.xpath("//div[@class='summary_subtotal_label']"));
        //System.out.println("webAltToplam.getText() = " + webAltToplam.getText());
        //System.out.println("webAltToplam.getText() = " + webAltToplam.getText().replaceAll("[^0-9,.]",""));
        Double altToplam=Double.parseDouble(webAltToplam.getText().replaceAll("[^0-9,.]",""));

        Assert.assertTrue("Değerler eşit değil",  (toplam==altToplam));

        BekleKapat();
    }


}
