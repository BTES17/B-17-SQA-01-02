
public class Simple2 {

void great()
{
	int a=101;   //find greatest number among three using if and else statement
	int b=302;
	int c=5;
	if (a>b && a>c)
	{
		System.out.println("a is greater");
	}
	else
	{
		if (b>c)
		{
			System.out.println("b is greater");
		}
		else 
		{
			
				System.out.println("c is greater");
			
		}
	}
}
void great1()// find greatest number amongest three using conditional operator such as ?,:
{
	int a=10;
	int b=8000;
	int c=999;
	int t;
  t= c>(a>b? a:b)? c:((a>b)?a:b); 
  System.out.println("Amongest three number greater number is="+(t));
}
void great2()//find greatest among three numner using if and else if statemnent
{
	int a=500;
	int b=307;
	int c=502;
	if (a>b && a>c)
	{
		System.out.println("a is greater");
	}
	else if (b>c)
	{
		System.out.println("b is gretest");
	}
	
	else
	{
		System.out.println("c is greatest");
	}
}
	

public static void main (String args[])
{
	Simple2 obj=new Simple2();
	Simple2 obj1=new Simple2();
	Simple2 obj3=new Simple2();
	obj.great();
	obj1.great1();
	obj3.great2();
	
}


}

