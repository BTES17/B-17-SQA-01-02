package Roman;

//WAP to enter the value in integer N through keyborad and print the series of the square of natural number upto N number of elements. like if you have enter 5 then square of first five natural number should be printed as 1 4 9 16 25.
import java.util.Scanner;

public class square {

Scanner scan =new Scanner(System.in);
{
System.out.println("enter value of N= ");
}
 int N= scan.nextInt();
		
void natural()
{
	int i, a;
	
	
	for (i=1;i<=N;i++)
	{
		a=i*i;
		
		System.out.println("square of natural no. N is "+a);
		
	}
}

public static void main(String[] args) {
	// TODO Auto-generated method stub

	square object=new square();
	object.natural();
	
	
}

}

