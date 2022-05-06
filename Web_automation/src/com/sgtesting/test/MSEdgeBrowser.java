package com.sgtesting.test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class MSEdgeBrowser 
{

public static WebDriver oBrowser=null;
public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		closeApplication();
	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.edge.driver", "E:\\ExampleAutomation\\Web_automation\\Library\\Driver\\msedgedriver.exe");
			oBrowser=new EdgeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void closeApplication()
	{
		try
		{
			oBrowser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}

