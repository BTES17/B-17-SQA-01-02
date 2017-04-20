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
	
	/*catch(Exception e)
	{
		System.out.println("Enter the age in numerical form please");
	}
	*/
	finally{
		
		System.out.println("Thank you for submitting your age, we will validate it shortly.");
	}
	
	System.out.println("checking if this prints or not.");
	
	}

public static void main(String args[])
{
	Ind Obj=new Ind();
	Obj.Indi();
	
}
}