package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Registration {
    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//      Maximise window
        driver.manage().window().maximize();
//      Open the given url
        driver.get("https://demo.nopcommerce.com/");
//      Click on Register link
        driver.findElement(By.linkText("Register")).click();
//        Enter first name
        driver.findElement(By.id("FirstName")).sendKeys("aaaa");
//        Enter last name
        driver.findElement(By.id("LastName")).sendKeys("bbbb");
//        Enter Email
        driver.findElement(By.id("Email")).sendKeys("aaaa@gmail1.com");
//        Enter password
        driver.findElement(By.id("Password")).sendKeys("aaaa1234");
//        Enter confirm password
        driver.findElement(By.id("ConfirmPassword")).sendKeys("aaaa1234");
//        Click on Register button
        driver.findElement(By.id("register-button")).click();

//        Get success message
        String successTxt = driver.findElement(By.xpath("//div[@class=\"result\"]")).getText();
        System.out.println(successTxt);


    }

}
