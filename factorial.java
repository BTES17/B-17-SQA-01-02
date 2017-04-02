package Roman;


import java.util.Scanner;

public class factorial {

	Scanner scan =new Scanner(System.in);
	{
	System.out.println("enter value of N= ");
	}
	 int N= scan.nextInt();
			
	void natural()
	{
		int i, a=1;
		
		
		for (i=1;i<=N;i++)
		{
			a=a*i;
			 
		
		}
		System.out.println("Factorial of "+N+" is "+a);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		factorial object=new factorial();
		object.natural();
		
		
	}

}
