package org.sel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class baseclass {
	public static WebDriver driver;
	 public static void launchBrowser() {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vimal\\eclipse-workspace\\BaseClass\\driver\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			driver=new ChromeDriver(options);
		    }
		    
	 public static void loadUrl(String url) {
			driver.get(url);

		}
	 public static void windowMax() {
			driver.manage().window().maximize();

			
		}
	 public static void fill(WebElement e,String s) {
	    	e.sendKeys(s);
		
		}
public  static  String getData(String ColumnName) throws SQLException
{
	Connection connection = null;
    String txt=null;
	try {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
	    connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","HR","12345");
		String sql="select * from fb;";
		PreparedStatement prepareStatement = connection.prepareStatement(sql);
		ResultSet resultSet = prepareStatement.executeQuery();
		while(resultSet.next())
		{
			
			  txt = resultSet.getString(ColumnName);
			  
			  }

	} 
	catch (ClassNotFoundException |SQLException e1) {
		
		e1.printStackTrace();
	}
	finally
	{
		connection.close();
	}
	return ColumnName;
}



}