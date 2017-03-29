package ishaan;

import java.util.Scanner;

public class square 
{
	public static void main(String[] args)
	{
		int n;
		System.out.println("Enter n");
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		int i=1;
		while(i<=n)
		{
			
			
			System.out.println(i*i);
			i++;
		}
		
		
	}
}
