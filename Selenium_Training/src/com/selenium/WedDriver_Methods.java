package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WedDriver_Methods {
	
       static WebDriver driver;
	
public static void property_Setup() {
      System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\Selenium_Training\\Driver\\chromedriver109.exe");
           driver = new ChromeDriver();
}
public static void browser_Methods() throws InterruptedException {
       driver.manage().window().maximize();
       Thread.sleep(2000);
       
       driver.get("https://www.gmail.com/");
       
      // String title = driver.getTitle();
      // System.out.println("Title is"+" "+title);
       
     //  String currentUrl = driver.getCurrentUrl();
    //   System.out.println("Current url is"+" "+currentUrl);
       
       //String pageSource = driver.getPageSource();
       //System.out.println("Page Source"+"="+pageSource);
       
       //String windowHandle = driver.getWindowHandle();
       //System.out.println(windowHandle);
}
public static void navigation_Methods() throws InterruptedException {
       driver.navigate().to("https://www.instagram.com/");
       Thread.sleep(3000);
       
       driver.navigate().back();
       Thread.sleep(2000);
       
       driver.navigate().forward();
       Thread.sleep(2000);
       
      // driver.navigate().refresh();
      // driver.quit();
}
public static void web_Element() throws InterruptedException {
       WebElement idname = driver.findElement(By.name("username"));
       idname.sendKeys("Dinu");
       Thread.sleep(2000);
       
       WebElement pwd = driver.findElement(By.name("password"));
       pwd.sendKeys("12345");
       Thread.sleep(2000);
       
       WebElement login = driver.findElement(By.className("_acan _aiit _acap _aijb _acas _aj1-"));
     login.click();
}
public static void main(String[] args) throws InterruptedException {
	
property_Setup();
browser_Methods();
navigation_Methods();
web_Element();
	
}
}
