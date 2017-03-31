package ishaan;

import java.util.Scanner;

public class Array1 
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter the size of array");
		int size=scan.nextInt();
	int[] array=new int[size];
	System.out.println("Enter integer values in array upto"+size);
    int i;
	for(i=0;i<size;i++)
	{
		array[i]=scan.nextInt();
	}
	for(i=0;i<size;i++)
	{
		System.out.println(array[i]);
	}
	}
	
	
	
}
