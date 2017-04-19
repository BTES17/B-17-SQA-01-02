import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception2 {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		try
		{
			try
			{
		System.out.println("Enter the value of a");
		int a= sc.nextInt();
		System.out.println("Enter the value of b");
		int b= sc.nextInt();
			}
			catch(InputMismatchException e)
			{
				System.out.println(e);
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println("Hello world");
		}
	}
}

