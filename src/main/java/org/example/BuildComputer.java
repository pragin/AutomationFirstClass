package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BuildComputer {
    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/drivers/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

//        get url
        driver.get("https://demo.nopcommerce.com/");
//        Click on Build your own computer link
        driver.findElement(By.xpath("//h2/a[@href='/build-your-own-computer']")).click();
//        Get the title and print it to the console
        String title = driver.findElement(By.xpath("//div[@class='product-name']/h1[contains(text(),'Build your own computer')]")).getText();
        System.out.println(title);



    }
}
