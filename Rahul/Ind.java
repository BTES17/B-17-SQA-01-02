import java.util.InputMismatchException;
import java.util.Scanner;

public class Ind {

	public void Indi() throws InputMismatchException
	{
		int a;
	Scanner scan=new Scanner (System.in);
	System.out.println("Enter your age");
	a=scan.nextInt();

		}

public static void main(String args[]) 
{
	Ind Obj=new Ind();
	
	try{
		Obj.Indi();
		
		System.out.println("OK, thank you for entering your age");
		}
	
	catch(InputMismatchException e)
	{
		System.out.println("Enter the age in numerical form please");
	}
	
}
}