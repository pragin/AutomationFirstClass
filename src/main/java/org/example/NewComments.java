package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class NewComments {
    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/test/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        //Open the website
        driver.get("https://demo.nopcommerce.com/");
        //Click on details button
        driver.findElement(By.xpath("//div[3]/a[@href='/nopcommerce-new-release']")).click();
        //Enter title
        driver.findElement(By.id("AddNewComment_CommentTitle")).sendKeys("first comment");
        //Enter comment
        driver.findElement(By.id("AddNewComment_CommentText")).sendKeys("Blah Blah Blah Blah Blah Blah ");
        //Click on new comment button
        driver.findElement(By.xpath("//button[@name='add-comment']")).click();
        //print the success text to the console
        String successText = driver.findElement(By.xpath("//div[@class='result']")).getText();
        System.out.println(successText);
    }
}
