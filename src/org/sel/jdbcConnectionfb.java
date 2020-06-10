package org.sel;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;




public class jdbcConnectionfb extends baseclass{
public static void main(String[] args) throws SQLException,ClassNotFoundException,NullPointerException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Vimal\\eclipse-workspace\\Seleniumday1\\newdriver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
    driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement fn = driver.findElement(By.id("email"));
	String data = getData("email");
	System.out.println(data);
	fn.sendKeys(data);
	WebElement fl = driver.findElement(By.id("pass"));
	String data1 = getData("password");
	System.out.println(data1);
    fl.sendKeys(getData("password"));

	WebElement e = driver.findElement(By.id("u_0_b"));
	e.click();
	
	
}
}
