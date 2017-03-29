import java.util.Scanner;

// Write a program to print fibonacci series that is 0 1 1 2 3 5 8 13 21..... 
// its like the sum of last two number will be the next number in the series. 
public class fibonnaci {
	 

	    public static void main(String args[]) {
	 
	        int a = 0;
	        int f1, f2, fib, i;
	        f1 = fib = 0;
	        f2 = 1;
	 
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Enter number: ");
	       
	        a = scan.nextInt();
	 
	        
	        for (i = 0; i < a; i++) {
	           
	            f1 = f2;
	            
	            f2 = fib;
	      
	            fib = f1 + f2;
	            System.out.print(fib);
	        }
	 
	    } 
	} 