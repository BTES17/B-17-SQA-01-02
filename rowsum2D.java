package ishaan;

import java.util.Scanner;

public class rowsum2D 
{
	public static void main(String[] args)
	{ 
		int r,c=0,sum=0;
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter the size of array");
		int rowsize=scan.nextInt();
		int columnsize=scan.nextInt();
		int[][] array=new int[rowsize][columnsize];
		
		for(r=0;r<rowsize;r++)
		{
			sum=0;
			for(c=0;c<columnsize;c++)
			{
				array[r][c]=scan.nextInt();
				sum=array[r][c]+sum;
			}System.out.println(sum);
		}
		
}
}
