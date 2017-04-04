package Roman;

import java.util.Scanner;

public class arraysum {

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
		System.out.println("Array sum =");
		 int sum=0;
		for(r=0;r<rowsize;r++)
		{
			
				for(c=0;c<columnsize;c++)
				{
					//System.out.print(" "+array[r][c]);
					
					sum=sum+array[r][c];
				}
		}				System.out.println(" "+sum);

		System.out.println("rowsum=");
		int rowsum=0;
		for(r=0;r<rowsize;r++)
		{
			rowsum=0;
				for(c=0;c<columnsize;c++)
					
				{
					//System.out.print(" "+array[r][c]);
					
					rowsum=rowsum+array[r][c];
					
				}System.out.println(""+rowsum);
		}				

		System.out.println("column sum=");
		int columnsum=0;
		for(c=0;c<columnsize;c++)
		{
			columnsum=0;
				for(r=0;r<rowsize;r++)
					
				{
					//System.out.print(" "+array[r][c]);
					
					columnsum=columnsum+array[r][c];
					
				}System.out.print(" "+columnsum);
		}				

	}

}
