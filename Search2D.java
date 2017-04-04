package ishaan;

import java.util.Scanner;

public class Search2D 
{
	public static void main(String[] args)
	{ 
		int r,c=0;
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter the size of array");
		int rowsize=scan.nextInt();
		int columnsize=scan.nextInt();
		int[][] array=new int[rowsize][columnsize];
		
		for(r=0;r<rowsize;r++)
		{
			for(c=0;c<columnsize;c++)
			{
				array[r][c]=scan.nextInt();
			}
		}
		System.out.println("Enter the element you want to search for");
		int n=scan.nextInt();
		for(r=0;r<rowsize;r++)
		{
			for(c=0;c<columnsize;c++)
			{
				
				if(n==array[r][c])
				 {
		           System.out.println("The number is present in the array");
		           break;
		       }
			}
			if (c<columnsize)
			{
				break;
			}
			
		}
		
		
		
		if(r==rowsize )
       {
           System.out.println("The number is not present in the array");

       }
	}
}
