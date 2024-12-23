package testmain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class HandleSelectTag extends DriverSetup{

    @Test
    public void testDropdownWithSelectTag() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement SelectElement = driver.findElement(By.id("dropdown-class-example"));
        SelectElement.click();
        Select Select = new Select(SelectElement);
        Select.selectByIndex(2);
        Thread.sleep(3000);
        SelectElement.click();
        Select.selectByValue("option3");
        Thread.sleep(3000);
        SelectElement.click();
        Select.selectByVisibleText("Option1");

        List<WebElement> options = Select.getOptions();
        for(WebElement op : options){
            System.out.println(op.getText());
        }
    }
}
