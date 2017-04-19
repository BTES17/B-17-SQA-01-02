//Write a code for nested try and catch block
package MyPack1;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Exception3 {
	 public static void main(String[] args) {
	        try {
	         
	            try {
	            	
	                System.out.println("enter value for a and b");
	                Scanner scan=new Scanner(System.in);
	                System.out.println("enter value for a");
	                int a=scan. nextInt();
	                System.out.println("enter value for b");
	                int b=scan. nextInt();
	                
	                int c=a/b;
	                System.out.println("result=" +c);
	            } 
	            catch (InputMismatchException e)
	            {
	                System.out.println("Input mismatch ");
	            }
	          
	            {
	                System.out.println("this is output after execution of catch statement ");
	            }
	        } 
	        catch (ArithmeticException e) 
	        {
	            System.out.println("ArithmeticException caught");
	        } 
	  
	        {
	            System.out.println("Hello java");
	        }
	    }
	}
