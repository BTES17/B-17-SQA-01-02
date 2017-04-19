// Write a code for try catch simulation. Experiment that code continue to execute even if exception occurs.
package MyPack1;

import java.util.Scanner;

public class Exception {
	public static void main(String args[])
	{
		System.out.println("enter values for a and b:");

		Scanner scan= new Scanner(System.in);
		System.out.println("enter values for a");
         int a =scan.nextInt();
         System.out.println("enter values for b");
			int b= scan.nextInt();
		
	
	try
	{
		int c=a/b;
		System.out.println("Result of value a and b is = " +c);
	}
	catch(ArithmeticException e)
	{
		System.out.println("You enter invalid value for b ");
	}
		System.out.println("Hello java");
	}
}
