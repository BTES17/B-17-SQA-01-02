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
		int i=1,j,sum=0;
		while(i<=n)
		{
			j=i*i;
			System.out.println(j);
		    sum=sum+j;
		    
		    i++;
		}
		System.out.println(sum);
		
	}
}
