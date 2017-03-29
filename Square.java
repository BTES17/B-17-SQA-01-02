//WAP to enter the value in integer N through keyborad and print the series of the 
 //square of natural number upto N number of elements. like if you have enter 5 then square
 //of first five natural number should be printed as 1 4 9 16 25.

    import java.util.Scanner;
	public class Square {
    public static void main(String[] args)
		{
			int n;
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter number");
			n=scan.nextInt();
			
			int i=1;
			while(i<=n)
			{
				
				
				System.out.println(i*i);
				i++;
			}
			
			
		}
	}

