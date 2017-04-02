package Roman;

import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n,b,c=0;
		
		System.out.println("enter digits to calculate its sum");
		Scanner in = new Scanner(System.in);
	      n= in.nextInt();
		
		
		while (n>0)
		{
		
		b=n%10;
		c=c+b;
		n=n/10;
	
		}
		
		
		System.out.println(""+c);
					
		
		
		
	}

}
