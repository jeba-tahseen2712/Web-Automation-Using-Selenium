package testmain;



import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Main extends DriverSetup{

    @Test
   public void testTitle(){

        // Load google URL
        driver.get("https://www.facebook.com");
        //Get Title
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        //assert Actual and expected result
        Assert.assertEquals("Facebook – log in or sign up", actualTitle);
        System.out.println(actualTitle);

    }

    @Test
    public void testUrl(){

        // Load google URL
        driver.get("https://www.facebook.com");
        //Get Title
        String actualUrl = driver.getCurrentUrl();
        //assert Actual and expected result
        Assert.assertEquals("https://www.facebook.com", actualUrl);


    }


    @AfterClass
    public void closeBrowser () {

        //Close browser
        driver.close();
    }


}