import java.util.Scanner;
public class array {
	
	void arr()
	{
		int size,i;
		Scanner scan=new Scanner(System.in);
	System.out.println("Enter size of array");
	size= scan.nextInt();
	
	int[] array1=new int[size];
	System.out.println("enter integer values in array to   "+size);
	
	for(i=0; i<size; i++)
	{
		
		array1[i]=scan.nextInt();
		
	}System.out.println();
	System.out.print("  values in array are:");
	for(i=0; i<size; i++)
	{
		
		
		System.out.print(" " +array1[i]);
	}System.out.println();
	
	int j,temp;
	for(i=0; i<size; i++)
	{
		for(j=i+1;j<size;j++)
		
		{
			if(array1[i]>array1[j])
				
			{
			temp=array1[i];
			array1[i]=array1[j];
			array1[j]=temp;
			
			}
				
		}
	}
	System.out.print("Sorted array:");
	for(j=0;j<size;j++)
	{
		
		System.out.print("  " +array1[j]);
	}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		array object= new array();
				object.arr();
		
	}

}
