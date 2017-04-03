//WAP to find largest elemnt in the array.
import java.util.Scanner;
public class ArrayMax {
	public static void main(String args[])
	{
		int n=0;
		int size=10;
		int a[] = new int[size]; 
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the series of array");
		size= scan.nextInt(); 
		
		for (int i=0;i<size;i++)
		{
			n=scan.nextInt();
			if(a[i]>n)
	        n=a[i];
			
			
		}
		
		
		System.out.println("maximum numbr is:" +n);
			
	}

}
