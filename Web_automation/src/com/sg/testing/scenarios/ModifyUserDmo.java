package com.sg.testing.scenarios;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModifyUserDmo 
{
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		lunchBrowser();
		navigate();
		login();
		FlyoutWindow();
		CreateUser();
		modifyUser();
		deleteUser();
		logout();
		closeBrowser();
	}
	private static void lunchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\ExampleAutomation\\Web_automation\\Library\\Driver\\chromedriver.exe");
			oBrowser = new ChromeDriver();
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
	private static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(6000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void FlyoutWindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsMenuCloseId")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void CreateUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(6000);
			oBrowser.findElement(By.xpath("//div [text()='Add User']")).click();
			Thread.sleep(6000);
			oBrowser.findElement(By.name("firstName")).sendKeys("Demo");
			oBrowser.findElement(By.name("lastName")).sendKeys("user");
			oBrowser.findElement(By.name("email")).sendKeys("demo@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("demouser1");
			oBrowser.findElement(By.name("password")).sendKeys("welcome123");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("welcome123");
			Thread.sleep(6000);
			oBrowser.findElement(By.xpath("//span [text()='Create User']")).click();
			Thread.sleep(10000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifyUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//span [text()='user, Demo']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).clear();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("Sample2");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span [text()='Save Changes']")).click();
			Thread.sleep(10000);
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void deleteUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//span [text()='user, Sample']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(6000);
			Alert oAlert=oBrowser.switchTo().alert();
			oAlert.getText();
			oAlert.accept();
			Thread.sleep(8000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try 
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void closeBrowser()
	{
		try 
		{
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
