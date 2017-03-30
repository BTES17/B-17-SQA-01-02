//WAP to find that a number is Palindrome or not 
 //  Example : Reversing a number will give the original number like 1221

import java.util.Scanner;
public class Palindrome {  
	  public static void main(String args[]){ 
	       System.out.print("Enter Number: ");
	       Scanner scan = new Scanner(System.in);
	       int num = scan.nextInt();
	       int n = num;
	       int rev=0,a; 
	       while(num > 0) 
	       { 
	         a = num % 10; 
	         rev = rev * 10 + a; 
	         num = num / 10; 
	       } 
	       if(rev == n) 
	         System.out.println(" Number is Palindrome "); 
	       else 
	         System.out.println("Number is Not  Palindrome "); 
	     } 
	}


