package Roman;
import java.util.Scanner;


public class Primeseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count=0;
		int N=2,n;
		System.out.println("enter how many  prime numbers you want to print");
		Scanner in = new Scanner(System.in);
	      n= in.nextInt();
		while(count<n)
		{
			int flag=0;
			int i;
			for(i=2;i<N;i++)
			{
				if(N%i==0)
				{
					flag=1;
					//System.out.println("Not prime"+N);
					break;
				}
			}
			if (flag==0)
			{
				System.out.println("Prime" +N);
				count++;
			}
			N++;
			
		}
	}

}
