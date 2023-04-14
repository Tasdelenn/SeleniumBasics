package Batch_05.Gun14;

import Batch_05.Utlity.BaseDriver;
import Batch_05.Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.Dimension;

public class _02_WindowSize extends BaseDriver {

    @Test
    public void Test1() {

        driver.get("https://www.youtube.com/");

        driver.manage().window().maximize();
        MyFunc.Bekle(4);

        Dimension yeniBoyut=new Dimension(516, 600);
        driver.manage().window().setSize(yeniBoyut);

        BekleKapat();
    }
}
