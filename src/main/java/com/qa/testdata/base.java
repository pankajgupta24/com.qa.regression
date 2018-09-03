package com.qa.testdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.qa.Utils.TestUtils;
import com.qa.pages.HomePage;

public class base {
	static WebDriver driver;
	static Properties prop;
	
	public base(){
		
		try{
			prop= new Properties();
			FileInputStream ip= new FileInputStream("C:\\Users\\paku0817\\workspace\\com.qa.regression\\src\\main\\java\\com\\qa\\config\\config.properties");
			prop.load(ip);
			}
		catch (FileNotFoundException e){
			e.printStackTrace();
		}
		catch (IOException e){
			e.printStackTrace();
		}
	}
	public  static void  intialization(){
		String url=prop.getProperty("url");
		String browsername=prop.getProperty("chrome");
		if (browsername.equals("chrome")){
			System.setProperty("", "");
			driver= new ChromeDriver();
		}
		else if (browsername.equals("firefox")){
			System.setProperty("", "");
			driver= new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtils.pageloadtimeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtils.implicitwait, TimeUnit.SECONDS);
		driver.get(url);
		
		
	}

}
