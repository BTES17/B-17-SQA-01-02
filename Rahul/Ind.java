import java.util.Scanner;

public class Ind {

	public void Indi() {
		int a;
	Scanner scan=new Scanner (System.in);
	System.out.println("Enter your age");
	
	
	try{
		a=scan.nextInt();
		
		System.out.println("OK, thank you for entering your age");
		}
	
	catch(Exception e)
	{
		System.out.println("Enter the age in numerical form please");
	}
	}

public static void main(String args[])
{
	Ind Obj=new Ind();
	Obj.Indi();
	
}
}