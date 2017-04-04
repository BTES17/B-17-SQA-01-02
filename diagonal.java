package Roman;
import java.util.Scanner;
public class diagonal {

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
		
		int sum=0;
		for(r=0;r<rowsize;r++)
		{
			
				
				{
					//System.out.print(" "+array[r][r]);
					
					sum=sum+array[r][r];
					
				}
				System.out.println(""+sum);
		}
		
		
		
	}

}
