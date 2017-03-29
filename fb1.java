import java.util.Scanner;

public class fb1 {
	public static void main(String args[]) {
		 
        int a = 0;
        int f1, f2, f, i;
        f1 = f = 0;
        f2 = 1;
 
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");
       
        a = scan.nextInt();
 
        
        for (i = 0; i < a; i++) {
           
            f1 = f2;
            
            f2 = f;
      
            f = f1 + f2;
            System.out.print(f);
        }
 
    } 
} 


