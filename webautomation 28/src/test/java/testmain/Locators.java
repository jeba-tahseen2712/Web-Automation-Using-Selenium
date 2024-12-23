package testmain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.List;



public class Locators extends DriverSetup {

    @Test
    public void testLocators() throws InterruptedException {
        driver.get("https://www.google.com/");
        WebElement Searchbox;

        //Searchbox= driver.findElement(By.id("APjFqb")); // find searchbox by id

        // find searchbox by name
        // Searchbox =driver.findElement(By.name("q"));

        // find searchbox by Class name
        //  Searchbox = driver.findElement(By.className("gLFyf"));

        // find searchbox by tagname

//        Searchbox = driver.findElement(By.tagName("textarea"));
//        Searchbox.sendKeys("Bangladesh-2024"); //if i want to write bangladesh in searchbox.
//        Thread.sleep(5000);
//        Searchbox.clear();
//        Thread.sleep(5000);


//        WebElement howsearchworklink = driver.findElement(By.linkText("সার্চ কীভাবে কাজ করে"));
//                       // WebElement howsearchworklink1 = howsearchworklink;
//        howsearchworklink.click();
//        Thread.sleep(5000);

        //partial link text
//        WebElement howsearchworklink = driver.findElement(By.partialLinkText("সার্চ কীভাবে"));
//        howsearchworklink.click();
//        Thread.sleep(5000);

//        WebElement inputButton = driver.findElement(By.cssSelector("input[class='gNO89b']"));
//        String inputButtonText = inputButton.getText(); //Store what is the button name
//        System.out.println(inputButtonText); //input tag a kono txt thakena empty print hobe
//        Thread.sleep(5000);


//
//      WebElement inputButton = driver.findElement(By.cssSelector("input[class='RNmpXc']")); //here use css selector ("tagname['attribute']")

        //use xpath
//        WebElement inputButton = driver.findElement(By.xpath("//input[@class='RNmpXc']"));
//
//        String inputButtonText = inputButton.getAttribute("value"); //Store what is the button attribute name here i get value
//        System.out.println(inputButtonText); //empty empty
//        Thread.sleep(5000);


        //ai 3 tai same kaj kore
//        driver.findElements (By.tagName("a"));
//        driver.findElement (By.cssSelector("a"));
//        driver.findElement (By.xpath("//a"));


        List<WebElement> linkElements = driver.findElements(By.tagName("a"));
        System.out.println(linkElements.size());
        for (WebElement linkelement : linkElements) {
            System.out.println(linkelement.getText());
            System.out.println(linkelement.getAttribute("href"));
        }


    }


    @Test
    public void testInteractionWithElement() {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement RadioButton2 =  driver.findElement(By.xpath("//input[@value='radio2']"));
        System.out.println(RadioButton2.isSelected());
        RadioButton2.click();
        System.out.println(RadioButton2.isSelected());

        WebElement hideTextBox = driver.findElement(By.xpath("//input[@id='displayed-text']"));
        hideTextBox.sendKeys("Hello");
        System.out.println(hideTextBox.getAttribute("value"));
        WebElement displayedtxt = driver.findElement(By.id("displayed-text"));
        System.out.println(displayedtxt.isDisplayed());
        driver.findElement(By.id("hide-textbox")).click();
        System.out.println(displayedtxt.isDisplayed());
        System.out.println(displayedtxt.isEnabled());
        WebElement element = driver.findElement(By.xpath("//legend[text()='Dropdown Example']"));
        System.out.println(element.getCssValue("background-color"));

    }
}

