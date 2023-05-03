package com.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin_HotelApp {
    static WebDriver driver;
public static void Property_Setup() {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\Selenium_Training\\Driver\\chromedriver109.exe");
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
	}
public static void Website_Launch() {
	driver.get("https://adactinhotelapp.com/HotelAppBuild2/");
}
public static void Login() throws InterruptedException, IOException {
	driver.findElement(By.id("username")).sendKeys("Dinu1998");
	Thread.sleep(1000);
	driver.findElement(By.id("password")).sendKeys("YGTC37");
	Thread.sleep(1000);
	driver.findElement(By.id("login")).click();
	
	TakesScreenshot ts = (TakesScreenshot)driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File desti = new File("C:\\Users\\admin\\eclipse-workspace\\Selenium_Training\\Screenshots\\login.png");
	FileUtils.copyFile(source, desti);
	
}
public static void Search_Hotels() throws InterruptedException, IOException {
	WebElement Location = driver.findElement(By.id("location"));
	Select st = new Select(Location);
	st.selectByVisibleText("London");
	Thread.sleep(1000);
	WebElement Hotels = driver.findElement(By.id("hotels"));
	Select st1 = new Select(Hotels);
	st1.selectByVisibleText("Hotel Sunshine");
	Thread.sleep(1000);
	WebElement RoomType = driver.findElement(By.id("room_type"));
	Select st2 = new Select(RoomType);
	st2.selectByVisibleText("Deluxe");
	Thread.sleep(1000);
	WebElement RoomNos = driver.findElement(By.id("room_nos"));
	Select st3 = new Select(RoomNos);
	st3.selectByVisibleText("2 - Two");
	Thread.sleep(1000);
	WebElement Checkin = driver.findElement(By.id("datepick_in"));
	Checkin.clear();
	Thread.sleep(1000);
	Checkin.sendKeys("01/04/2023");
	Thread.sleep(2000);
	WebElement CheckOut = driver.findElement(By.id("datepick_out"));
	CheckOut.clear();
	Thread.sleep(1000);
	CheckOut.sendKeys("03/04/2023");
	Thread.sleep(2000);
	WebElement Adults = driver.findElement(By.id("adult_room"));
    Select st4 = new Select(Adults);
    st4.selectByVisibleText("3 - Three");
	Thread.sleep(1000);
	WebElement Child = driver.findElement(By.id("child_room"));
	Select st5 = new Select(Child);
	st5.selectByVisibleText("2 - Two");
	Thread.sleep(2000);
	driver.findElement(By.id("Submit")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("radiobutton_0")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("continue")).click();
	Thread.sleep(2000);
	TakesScreenshot ts = (TakesScreenshot)driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File desti = new File("C:\\Users\\admin\\eclipse-workspace\\Selenium_Training\\Screenshots\\searchpage.png");
	FileUtils.copyFile(source, desti);
}
public static void Book_A_Hotel() throws InterruptedException, IOException {
	driver.findElement(By.id("first_name")).sendKeys("Dinesh");
	Thread.sleep(1000);
	driver.findElement(By.id("last_name")).sendKeys("Kumar");
	Thread.sleep(1000);
	driver.findElement(By.id("address")).sendKeys("Avadi,Chennai");
	Thread.sleep(1000);
	driver.findElement(By.id("cc_num")).sendKeys("1234567887654321");
	Thread.sleep(1000);
	WebElement Cc_Type = driver.findElement(By.id("cc_type"));
	Select st6 = new Select(Cc_Type);
	st6.selectByVisibleText("VISA");
	Thread.sleep(1000);
	WebElement Exp_Month = driver.findElement(By.id("cc_exp_month"));
	Select st7 = new Select(Exp_Month);
	st7.selectByVisibleText("March");
	WebElement Exp_Year = driver.findElement(By.id("cc_exp_year"));
	Select st8 = new Select(Exp_Year);
	st8.selectByVisibleText("2020");
	Thread.sleep(1000);
	driver.findElement(By.id("cc_cvv")).sendKeys("890");
	Thread.sleep(2000);
	driver.findElement(By.id("book_now")).click();
	Thread.sleep(5000);
	driver.findElement(By.id("my_itinerary")).click();
	TakesScreenshot ts = (TakesScreenshot)driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File desti = new File("C:\\Users\\admin\\eclipse-workspace\\Selenium_Training\\Screenshots\\itinerary.png");
	FileUtils.copyFile(source, desti);
	driver.quit();
}
public static void main(String[] args) throws InterruptedException, IOException {
	Property_Setup();
	Website_Launch();
	Login();
	Search_Hotels();
	Book_A_Hotel();
}
}
