package com.sgtesting.autoit;

public class ExecuteAutoITDemo 
{
	public static void main(String[] args) 
	{
		executeAutoIT();
	}
	private static void executeAutoIT()
	{
		try
		{
			//Runtime.getRuntime().exec("E:\\ExampleAutomation\\exampleautoit\\Displaymessage.exe");	
			Runtime obj=Runtime.getRuntime();
			obj.exec("E:\\ExampleAutomation\\exampleautoit\\Displaymessage.exe");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
