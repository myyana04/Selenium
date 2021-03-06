package HomeWork_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomeWork2 {
    @Test
    public void homeWork2()  {

        System.setProperty("webdriver,chrome,chromedriver", "./chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");  //launch facebook.com
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        //enter "myemail@gmail.com"
        String emailId="email";
        By emailLocator=By.id(emailId);
        WebElement emailBox=driver.findElement(emailLocator);

        emailBox.sendKeys("myemail@gmail.com");

        //enter password: "passw0rd"
        String passName="pass";
        By passLocator=By.name(passName);
        WebElement passBox=driver.findElement(passLocator);
        passBox.sendKeys("passw0rd");

       driver.findElement(By.name("login")).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();



    }
}
