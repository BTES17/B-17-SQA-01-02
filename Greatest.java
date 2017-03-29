
public class Greatest {
void great()
{
	int a=10000;   //find greatest number among three using if and else statement
	int b=900;
	int c=555;
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
	int a=100;
	int b=20;
	int c=30;
	int t;
  t= c>(a>b? a:b)? c:((a>b)?a:b); 
  System.out.println(t);
}
void great2()//find greatest among three numner using if and else if statemnent
{
	int a=5;
	int b=307;
	int c=50;
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
	Greatest obj=new Greatest();
	Greatest obj1=new Greatest();
	Greatest obj2=new Greatest();
	obj.great();
	obj1.great1();
	obj2.great2();
	
}


}
