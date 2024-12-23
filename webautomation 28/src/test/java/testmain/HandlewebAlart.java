package testmain;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HandlewebAlart extends DriverSetup{
    @Test
    public void testAlert() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        Thread.sleep(2000);



        driver. findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        Thread.sleep(2000);


        By jsPrompt= By.xpath("//button[@onclick='jsPrompt()']");

        driver.findElement(jsPrompt).click();
        alert= driver.switchTo().alert();
        System.out.println(alert.getText());
        Thread.sleep(2000);
        alert.sendKeys("hello");

        alert.accept();
        Thread.sleep(2000);







    }
}
