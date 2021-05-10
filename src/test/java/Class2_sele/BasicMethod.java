package Class2_sele;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicMethod {

    @Test
    public void basicMethod1() throws InterruptedException {

        System.setProperty("webdriver,chrome,chromedriver","./chromedriver");

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com/");
        Thread.sleep(5000);

        //to move back and forward
        //Method: back
        //Method: forward
        driver.navigate().back();  //back only once
        Thread.sleep(5000);
        driver.navigate().forward();  //forward only once

        /** To refresh a webpage
        1. refresh method
        driver.navigate().refresh();

        /**2. get current url using getCurrentUrl method
        launch the result on step 1 with get()

        String currUrl=driver.getCurrentUrl();
        driver.get(currUrl);

         3.
       driver.navigate().back();
       driver.navigate().forward();
         */
        driver.navigate().refresh();

        /**
         * How to verify test case
         * usling Assert method
         * Every test case must verify something using Asser
         * and close test case with quit
         */



    }






}
