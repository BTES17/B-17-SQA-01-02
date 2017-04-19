package mypackage2;
import java.util.Scanner;

public class Except {
	
	
	int a,b;
	Scanner scan= new Scanner(System.in);
	void method()
	{
	System.out.println("Enter values of a & b:");
	
	try
	{
	a=scan.nextInt();
	b=scan.nextInt();
	
	int c=a/b;
	System.out.println(c);	}
	
	catch(Exception e)
	{
		System.out.println("invalid b  "+e);
	}
	}
	
public static void main(String[] args) {
		
	Except obj=new Except();
	obj.method();
	
	}
}
