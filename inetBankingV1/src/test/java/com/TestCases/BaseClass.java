package com.TestCases;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.log4testng.Logger;

import com.utilities.ReadConfig;

public class BaseClass {
	
	ReadConfig readconfig=new ReadConfig();
	

	public String baseURL=readconfig.getApplicationURL();
	public String username=readconfig.getUsername();
	public String password=readconfig.getPassword();
	public static WebDriver driver;
	
	public static Logger logger;
	
	
	
	@BeforeClass
	@Parameters("browser")
	public void setup(String br)
	{
		if(br.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", readconfig.getChromepath());
		driver=new ChromeDriver();
		}
		else if(br.equals("ie"))
		{
		System.setProperty("webdriver.ie.driver", readconfig.getiepath());
		driver=new InternetExplorerDriver();
		}
	driver.get(baseURL);	
	}
	 @AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}
