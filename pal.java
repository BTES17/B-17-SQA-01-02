package Roman;

import java.util.Scanner;

public class pal {
	public static void main(String args[])
	   {
		      int n1,M, N ,c=0;
		 
		      System.out.print("Enter the number to find its reverse and palindrome or not");
		      Scanner in = new Scanner(System.in);
		      N= in.nextInt();
		M=N;
		      	 
 
		 
	 	while(N>0)
	 	{
	 		
	 		         n1 =N%10;
	 		          System.out.print(""+n1);
	 		          c=c*10+n1;
	 		          N = N/10;
	 		          
	 		
	 	}
	 	
	 	
		 if (c==M)
		 {
			 System.out.println("It is palindrome no.");
			 
			
		 }
		 else 
		 {
			 System.out.println("It is not a palindrome no.");
		 }
	 	
	 		 
		          }
}
