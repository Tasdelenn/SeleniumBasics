package Batch_05.Gun04;


import Batch_05.Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_FindingByIdNotFoundException {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353"); // sayfaya gittim

        try {
            WebElement labelFirstName = driver.findElement(By.id("hataliLocator"));
            System.out.println("labelFirstName.getText() = " + labelFirstName.getText());
        } catch (Exception ex) {
            System.out.println("WebElement bulunamadı " + ex.getMessage());
        }

        MyFunc.Bekle(3);
        driver.quit();

    }
}
