import java.util.Scanner;
// WAP to search an element in the array.

public class Search1 {
	public static void main (String args[])
	{
		int i;
		{
			int a[] = new int[] {111,2,33,56,17,9,55,28};
			Scanner sc = new Scanner(System.in);
			System.out.println("enter any number:");
			int b=sc.nextInt();
			
			for(i=0;i <a.length;i++)
			{
				if(a[i]==b)
					break;
			}
			
			
			if(i>=0 && i<8)
			{
				System.out.println("number exist at position" +i);
			}
			else
			{
				System.out.println("given number not exist" );
				
		}
		
	}
	
	}
}

