import java.util.Scanner;

// Write a program to find factorial of number say number is 5 
// then factorial will be 1*2*3*4*5=120

public class Fact {
	public static void main (String args[])
	{
		int num=0;
		int i;
		int fact=1;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		num=scan.nextInt();
		for(i=1;i<=num;i++)
		{
			fact=fact*i;
			
		}
		System.out.println();
		System.out.println("Fact of number  is ="+ fact );
		
	
	}

}
