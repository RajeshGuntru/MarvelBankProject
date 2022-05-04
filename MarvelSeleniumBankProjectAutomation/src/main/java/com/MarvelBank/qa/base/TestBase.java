package com.MarvelBank.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public static Properties prop;
	public static WebDriver driver;
	public TestBase()
	{
		 prop =new Properties();
		try {
			FileInputStream ip = new FileInputStream("C:\\Users\\SRK\\eclipse-workspace\\MarvelSeleniumBankProjectAutomation\\src\\main\\java\\com\\MarvelBank\\qa\\config\\config.properties");
		prop.load(ip);
		} 
		catch (FileNotFoundException e) 
		{
		 e.printStackTrace();
		}
		catch 
		(IOException e)
		{
	     e.printStackTrace();
		}
	}	
public static void initializatio() 
{
	String BrowserName=prop.getProperty("browser");
	if(BrowserName.equals("chrome")) 
	{
	System.setProperty("webdriver.chrome.driver","C:\\seleniumdriver\\chromedriver.exe" );
	 driver = new ChromeDriver();
	}
    }   
   {
     driver.manage().window().maximize();
     driver.get(prop.getProperty("url"));
   }
}