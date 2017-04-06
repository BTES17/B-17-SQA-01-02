//WAP to print the char in the string uppercase and lowercase alternatively. 


import java.util.Scanner;
import java.lang.String;
public class Exist {
	
	public void ex() {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=scan.nextLine();
		System.out.println("The entered string is "+s);
		int a=s.length();
		int i;
		for(i=0;i<a;i++)
		{
			if(i%2==0)
			{
			char b=s.charAt(i);	
			char d=Character.toUpperCase(b);
			System.out.print(d);
			}
			
			else if (i%2==1)
			{
				char c = s.charAt(i);
				
				char e=Character.toLowerCase(c);
				System.out.print(e);
				}
		}
		
	}
	
	public static void main(String args[])
	{
		Exist Obj=new Exist();
		Obj.ex();
		
	}

}
