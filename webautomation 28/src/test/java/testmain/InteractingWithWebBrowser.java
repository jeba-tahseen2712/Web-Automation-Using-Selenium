package testmain;

import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class InteractingWithWebBrowser extends DriverSetup{
@Test
    public void testInteractionWithBrowser() throws InterruptedException {
        driver.get("https://www.google.com/");
        //title
        System.out.println("Page title is: " + driver.getTitle());
        //URL
    String actualUrl = driver.getCurrentUrl();
    System.out.println("Page URL is: " + actualUrl);

    //window maximization
//    driver.manage().window().maximize();
//    Thread.sleep(2000);

    //Minimization
//    driver.manage().window().minimize();
//    Thread.sleep(2000);

    //full screen
//    driver.manage().window().fullscreen();
//    Thread.sleep(2000);

    //navigate- google to facebook
//    driver.navigate().to("https://www.facebook.com/");
//    Thread.sleep(2000);
//
//    driver.navigate().back();//back to google again
//    Thread.sleep(2000);
//
//    driver.navigate().forward(); //go to fb
//    Thread.sleep(2000);


    //Refresh
//    driver.navigate().refresh();
//    Thread.sleep(2000);

    //open new Tab window
//    driver.switchTo().newWindow(WindowType.TAB); //open a new tab
//    Thread.sleep(2000);

    //open a new window
//    driver.switchTo().newWindow(WindowType.WINDOW); //open a new tab
//    Thread.sleep(2000);

    //handle unique id
    String windowhandle = driver.getWindowHandle();
    System.out.println(windowhandle);

    ArrayList<String> windowhandles = new ArrayList<>( driver.getWindowHandles());
    for(String handle : windowhandles) {
        System.out.println(handle);
    }

    driver.switchTo().window(windowhandles.get(0));//close 1st open browser
    driver.close();


    }
}
