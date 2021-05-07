package class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Kickoff {

    @Test
    public void launchWebPage(){
        //path of chrome driver
        System.setProperty("webdriver,chrome,chromedriver","./chromedriver");
        WebDriver driver=new ChromeDriver();
        String url="https://www.facebook.com/";
        //to launch a we page: 2 methods-->driver.get() OR
        //driver.navigate().to();
        //driver.get("https://www.facebook.com");
        //OR
        driver.navigate().to("https://www.facebook.com/");

        //to maximize webpage
        //driver.manage().window().maximize();

        //To get page title-->method: getTitle();
        String pageTitle=driver.getTitle();
        //String expPageTitle="Facebook-Log In or Sign Up";
        //Assert.assertEquals(pageTitle,expPageTitle,"Page title not appeared expected");

        //to get Url of the driver assoc
        //ited with windo
         String pageUrl=driver.getCurrentUrl();
         Assert.assertEquals(url,pageUrl,"Url mismatch");

        // to close a webpage-->2 methods
        //1.driver.close()
        //2.driver.quit()
        driver.quit();


    }
}
