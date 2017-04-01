import java.util.Scanner;

public class fibonnac1 {
	public static void main(String args[]) {
		 
        int a = 0;
        int f1, f2, fib, i;
        f1 = fib = 0;
        f2 = 1;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
       
        int n = scan.nextInt();
        
        System.out.print(a);
        
        for (i = 0; i < n; i++) {
        	
           
            f1 = f2;
            
            f2 = fib;
      
            fib = f1 + f2;
            System.out.print(fib+"");
        }
 
    } 
}

}
