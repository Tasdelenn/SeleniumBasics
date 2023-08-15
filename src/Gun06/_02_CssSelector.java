package Gun06;

import Utlity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_CssSelector extends BaseDriver {

    public static void main(String[] args) {
        driver.get("http://demo.seleniumeasy.com/basic-first-form-demo.html");

        String mesaj="merhaba selenium";
        WebElement txtBox=driver.findElement(By.cssSelector("input[id='user-message']"));
        txtBox.sendKeys(mesaj);

        WebElement btn=driver.findElement(By.cssSelector("[onclick='showInput();']"));
        btn.click();

        WebElement msg=driver.findElement(By.cssSelector("[id='display']"));

        if (msg.getText().contains(mesaj))
            System.out.println("TEST PASSED");
        else
            System.out.println("TEST FAILED ....");

        BekleVeKapat();
    }

}
