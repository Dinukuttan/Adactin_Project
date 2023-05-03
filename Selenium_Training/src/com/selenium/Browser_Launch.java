package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium_Training\\Driver\\chromedriver108.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
}
}
