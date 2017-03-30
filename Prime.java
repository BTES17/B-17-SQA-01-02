  //  WAP to print the series of first N prime numbers.

import java.util.Scanner;
public class Prime {
	
   public static void main(String args[])
	    {
	        int num, i, count=0;
	        Scanner scan = new Scanner(System.in);
			
	        System.out.print("Enter a Number : ");
	        num = scan.nextInt();
			
	        for(i=2; i<num; i++)
	        {
	            if(num%i == 0)
	            {
	                count++;
	                break;
	            }
	        }
	        if(count == 0)
	        {
	            System.out.print("Number is Prime ");
	        }
	        else
	        {
	            System.out.print(" Number is not Prime ");
	        }
	    }
	}
