package Roman;

//1.To declare and print the array 
//2.To search a no. in the array 
//3. To find the maximum no. in the array
import java.util.Scanner;
public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int r,c, rowsize, columnsize;
		Scanner Scan=new Scanner(System.in);
		System.out.println("Enter row value");
		rowsize=Scan.nextInt();
		System.out.println("Enter column value");
	
		columnsize=Scan.nextInt();
		
		int array[][]=new int[rowsize][columnsize];
		
		System.out.println("Enter values in array");
		
		for(r=0;r<rowsize;r++)
		{
			
				for(c=0;c<columnsize;c++)
				{
					array[r][c]=Scan.nextInt();
					
				}
				
		}
		
		for(r=0;r<rowsize;r++)
		{
			
				for(c=0;c<columnsize;c++)
				{
					System.out.print(" "+array[r][c]);
					
				}
				System.out.println("");
		}
		
		int N,flag=0;;
	System.out.println("Enter no. to search in the array");
	N=Scan.nextInt();
		
		for(r=0;r<rowsize;r++)
		{
			
		for(c=0;c<columnsize;c++)
				{
					
					
				
		if (N==array[r][c])
		{
			System.out.println("Entered no. is present in the array");
			flag=1;
		} }
			
		}
		if(flag==0)
		{
			System.out.println("Entered no. is not present in the array");
		}

				
		
			int max=array[0][0];
			for(r=0;r<rowsize;r++)
			{
				
			for(c=0;c<columnsize;c++)
					{
						if(max<array[r][c])
		 		
						{
							max=array[r][c];
					
						}
						
					}
			}System.out.println("maximum element in array is "+max);
			
	}
}
			