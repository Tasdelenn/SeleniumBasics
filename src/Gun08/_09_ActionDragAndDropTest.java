package Gun08;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _09_ActionDragAndDropTest extends BaseDriver {

        @Test
        public void Test1() {
            driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
            Actions driverAksiyon = new Actions(driver);

            MyFunc.Bekle(2);
            WebElement oslo=driver.findElement(By.id("box1"));
            WebElement norway=driver.findElement(By.id("box101"));

            //1.yöntem
            driverAksiyon.dragAndDrop(oslo, norway).build().perform();
            // oslo yu al norway e götür bırak

            //2.Yöntem : 2 aşamalı
            driverAksiyon.clickAndHold(oslo).build().perform(); // osloyu eline al.
            driverAksiyon.moveToElement(norway).release().build().perform(); // norway in üzerine git bırak

            BekleVeKapat();
        }

}
