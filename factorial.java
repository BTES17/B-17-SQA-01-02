import java.util.Scanner;

public class factorial {

	public static void main (String args[])
	{
		int n=0;
		int i;
		int f=1;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		n=scan.nextInt();
		for(i=1;i<=n;i++)
		{
			f=f*i;
			
		}
		System.out.println();
		System.out.println("Factorial  of number  is ="+ f);
		
	
}

}
