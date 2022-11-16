package com.data.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.data.pages.RegPage;
import com.data.utility.Common;
import com.data.utility.ExcelRead;

public class TestExecutor {
	
	
	public static WebDriver driver;
	
	public static Common com = new Common();
	
	public static RegPage reg = new RegPage();
	
	public static HashMap map = new HashMap();
	
	public static DataFormatter format = new DataFormatter();
	
	public static ExcelRead excel = new ExcelRead();
	
	public static ExtentHtmlReporter reporter;
	
	public static ExtentReports report;
	
	public static ExtentTest test;

	@BeforeTest
	public void createReport()
	{
		reporter = new ExtentHtmlReporter("C:\\neworkspace\\DataDrivenNov\\ExtentReport\\demotest.html");
		
		report= new ExtentReports();
		
		report.attachReporter(reporter);
	}
	
	
	@BeforeMethod
	public void launchurl() throws IOException
	{
		File f = new File("C:\\neworkspace\\DataDrivenNov\\src\\test\\java\\com\\data\\config\\Environment.properties");
		FileInputStream fis = new FileInputStream(f);
		
		Properties prop = new Properties();
		prop.load(fis);
		
	String url =	prop.getProperty("URL");
	
	System.out.println(prop.getProperty("username"));
	System.out.println(prop.getProperty("password"));
		
		
String Browser =	prop.getProperty("browser");

if(Browser.equalsIgnoreCase("chrome"))
{
	System.setProperty("webdriver.chrome.driver", "e:\\Karen Amy\\Downloads\\New folder (16)\\chromedriver.exe");
	
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
}
else if(Browser.equalsIgnoreCase("firefox"))
{
System.setProperty("webdriver.gecko.driver", "C:\\neworkspace\\Selenium_Oct\\exe\\chromedriver.exe");
	
	driver = new FirefoxDriver();
	
	driver.manage().window().maximize();
}

		
		driver.get(url);
	}

	
	@AfterMethod
	public void endreport()
	{
		report.flush();
		driver.close();
	}
}
