package Gun08;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02_SelectClass extends BaseDriver {

    @Test
    public void Test1(){
        driver.get("https://www.amazon.com/");

        WebElement webMenu=driver.findElement(By.id("searchDropdownBox"));

        Select ddMenu=new Select(webMenu); // elementi daha raht kullanılabilir SELECT nesnesi haline dönüştürdü.

        // bu element select tag i ile başlıyorsa, sne bunu SELECT e cast yap ve öyle kullan.

        //ddMenu.selectByIndex(4); //// ister bu şekilde seçebilirsin   : indexle
        //ddMenu.selectByValue("search-alias=electronics-intl-ship"); // ister bu şekilde seçebilirsin : value ile
        ddMenu.selectByVisibleText("Electronics");  // ister bu şekilde seçebilirsin : görünen string ile

        System.out.println("ddMenu.getOptions().size() = " + ddMenu.getOptions().size());
        // select in kaç tane option u var bunu bu şekilde alabiliriz.
        for(WebElement e: ddMenu.getOptions()) {
            System.out.print("e.getText() = " + e.getText());
            System.out.println("- value= " + e.getAttribute("value"));
        }

        BekleVeKapat();
    }



}
