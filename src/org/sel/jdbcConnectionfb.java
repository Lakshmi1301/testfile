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
public static void main(String[] args) throws SQLException,ClassNotFoundException {
		WebDriverManager.chromedriver().setup();
		launchBrowser();

	loadUrl("https://www.facebook.com/");
	windowMax();
	WebElement fn = driver.findElement(By.xpath("//input[@type='email']"));
	String data = getData("email");
	fn.sendKeys(data);
	WebElement fl = driver.findElement(By.xpath("(//input[@class='inputtext login_form_input_box'])[2]"));
	String data1 = getData("password");
    fl.sendKeys(data1);

	WebElement e = driver.findElement(By.xpath("//input[@type='submit']"));
	e.click();
	
	
}
}
