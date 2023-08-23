package Gun07;

//        Senaryo
//        1- https://www.saucedemo.com/
//        2- login işlemini yapınız.
//        3- Sauce Labs Backpack  a tıklatın ve sepete ekletin.
//        4- Sonra geri dönün (Back to products e tıklatın)
//        5- Sauce Labs Bolt T-Shirt  a tıklatın ve sepete ekleyin.
//        6- sepete tıklatın
//        7- CheckOut a tıklatın
//        8- kullanıcı bilgilerini doldurup Continue ya tıklatın
//        9- Burada her bir eşyanın ücretlerinin toplamının aşağıdaki
//        Item total e eşit olup olmadığını Assert ile test ediniz.
//
//        Bu soruda tamamen XPATH kullanılacaktır.


import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _02_Senaryo extends BaseDriver {

    @Test
    public void Sepet_Test1()
    {
        driver.get("https://www.saucedemo.com/");

        MyFunc.Bekle(1);
        WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
        username.sendKeys("standard_user");

        MyFunc.Bekle(1);
        WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("secret_sauce");

        MyFunc.Bekle(1);
        WebElement loginButton=driver.findElement(By.xpath("//input[@id='login-button']"));
        loginButton.click();
        MyFunc.Bekle(2);

        //1.Ürün sepete eklendi
        WebElement product1=driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
        product1.click();
        MyFunc.Bekle(2);

        WebElement addToCart=driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-backpack']"));
        addToCart.click();
        MyFunc.Bekle(2);

        WebElement btnBack=driver.findElement(By.xpath("//*[@id='back-to-products']"));
        btnBack.click();
        MyFunc.Bekle(2);

        //2.Ürün sepete eklendi
        WebElement product2=driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']"));
        product2.click();
        MyFunc.Bekle(2);

        WebElement addToCart2=driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-bolt-t-shirt']"));
        addToCart2.click();
        MyFunc.Bekle(2);

        WebElement sepet=driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        sepet.click();
        MyFunc.Bekle(2);

        WebElement buttonCheckOut=driver.findElement(By.xpath("//*[@id='checkout']"));
        buttonCheckOut.click();
        MyFunc.Bekle(2);

        //Kullanıcı bilgileri giriliyor
        WebElement firstname=driver.findElement(By.xpath("//input[@id='first-name']"));
        firstname.sendKeys("Emrullah");
        MyFunc.Bekle(1);

        WebElement lastname=driver.findElement(By.xpath("//input[@id='last-name']"));
        lastname.sendKeys("Yılmaz");
        MyFunc.Bekle(1);

        WebElement zipcode=driver.findElement(By.xpath("//input[@id='postal-code']"));
        zipcode.sendKeys("323232");
        MyFunc.Bekle(1);

        WebElement btnContinue=driver.findElement(By.xpath("//*[@id='continue']"));
        btnContinue.click();
        MyFunc.Bekle(2);

        // Ürünlerin ücret toplamlarının kontrolü
        List<WebElement> ucretler=driver.findElements(By.xpath("//div[@class='inventory_item_price']"));

        double toplam=0;
        for(WebElement e: ucretler)
        {
            System.out.println(e.getText());
            toplam= toplam+ Double.parseDouble( e.getText().replaceAll("[^0-9,.]","")   );
        }
        System.out.println("toplam = " + toplam);

        // item total alındı ve double a çevrildi
        WebElement itemtotalElement=driver.findElement(By.xpath("//div[@class='summary_subtotal_label']"));
        Double itemtotal= Double.parseDouble( itemtotalElement.getText().replaceAll("[^0-9,.]","")   );
        System.out.println("itemtotal = " + itemtotal);

        Assert.assertTrue("Değerler eşit değil", toplam== itemtotal);

        BekleVeKapat();
    }




}
