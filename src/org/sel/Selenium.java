package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium {
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vimal\\eclipse-workspace\\Seleniumday1\\drive\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
	
	    String title = driver.getTitle();
	    System.out.println(title);
	
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println(currentUrl);

//		WebElement fe = driver.findElement(By.id("email"));
//		fe.sendKeys("vimalachokalingam13@gmail.com");
//
//		WebElement fw = driver.findElement(By.name("pass"));
//		fw.sendKeys("56789");

        WebElement fn = driver.findElement(By.xpath("//input[@type='email']"));
        fn.sendKeys("vimalachokalingam13@gmail.com");
    
        WebElement fl = driver.findElement(By.xpath("(//input[@class='inputtext login_form_input_box'])[2]"));
        fl.sendKeys("567");
   
		WebElement e = driver.findElement(By.xpath("//input[@type='submit']"));
		e.click();

	}
}
