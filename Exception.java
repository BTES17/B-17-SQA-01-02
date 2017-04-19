import java.util.Scanner;

public class Exception {
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a= scan.nextInt();
		System.out.println("Enter the value of b");
		int b =scan.nextInt();
		try
		{
			int c= a/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println("invalid value of b");
		}
		System.out.println("Hello world");
	}
	
	}


