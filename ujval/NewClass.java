package mypackage;

import java.util.Scanner;

public class NewClass {
	static int age;
	
	public void method() throws ArithmeticException
	{
		
		if(age<18)
{
	throw new ArithmeticException("Age is not valid");
}
	}
	public static void main(String args[])
	{
		NewClass obj= new NewClass();
		Scanner scan = new Scanner(System.in);
		
		
	try
	{
		System.out.println("Enter the age");
		 age = scan.nextInt();
	
		
		obj.method();
		
	
		try
		{
			
			
			System.out.println("you can vote");
			
		}
		catch(Exception e)
		
		{
			System.out.println(e);	
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
 
}

