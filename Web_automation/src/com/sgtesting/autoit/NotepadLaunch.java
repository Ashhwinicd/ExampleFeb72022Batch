package com.sgtesting.autoit;

public class NotepadLaunch 
{
	public static void main(String[] args) 
	{
		executeAutoIT();
	}
	private static void executeAutoIT()
	{
		try
		{
			Runtime obj=Runtime.getRuntime();
			obj.exec("E:\\ExampleAutomation\\exampleautoit\\NotepadLaunchWrite.exe");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}


}
