package Class2_sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Locator {

    @Test
    public void practical() {

        System.setProperty("webdriver,chrome,chromedriver","./chromedriver");

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com/");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //enter email as abcd@test.com

        //steps to interact with web elements
        String emailId="email";   //step 1
        By emailLocator=By.id(emailId);   //step 2
        WebElement emailBox=driver.findElement(emailLocator);   //step 3
        //to type somethig, method: sendKey()
        //to clear box, method: clear()
        emailBox.sendKeys("abcd@test.com"); //step 4

        /**
         * driver.findElement(By.id("email")).sendKeys("abcd@test.com");
         * all 4 steps combined
         */

        //enter password as abcd@1234

        String passName="pass";
        By passLocator=By.name(passName);
        WebElement passBox=driver.findElement(passLocator);
        passBox.sendKeys("abcd@1234");

        /**enter class name as abcd@1234

        String passClass="_6ltj";
        By passLocator_2=By.className(passClass);
        WebElement passBox_2= driver.findElement(passLocator_2);
        passBox_2.sendKeys("abcd@1234");
         */




    }




}
