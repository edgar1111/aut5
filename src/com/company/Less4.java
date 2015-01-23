package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * Created by user on 1/19/15.
 */
public class Less4 {
 public static void main (String [] agrs){
     System.setProperty("webdriver.chrome.driver","D:\\Listen/chromedriver.exe"
             );
     WebDriver a = new ChromeDriver();

     a.get("http://google.com");

     WebElement i = a.findElement(By.id("gbqfq"));
             i.sendKeys("qa factory");
     WebElement h = a.findElement(By.id("gbqfb"));
      h.click();
     Thread.sleep(1000);

     WebDriver k = a.findElement(By.id("res"));
     List<WebElement> l = k.findElement(By.tagName("a".));
     if (f.getText )
         System.out.println(f.getAttribute("href"));
     a.quit();



             //a.quit();
 }
}
