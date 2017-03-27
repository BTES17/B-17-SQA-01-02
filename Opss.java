
public class Opss {

	public void cond()
	
	{
		int a,b,c;
		a=5;
		b=10;
		c=a--;
		System.out.println("C is "+c);
		System.out.println("A is "+a);
		
	}
	
	
	public void cond1()
	
	
	{
		int a,b;
		a=5;
		b=4;
		if (a>b)
		{
			
			System.out.println("a is greater than b");
			
		}
		else
		{
			
			System.out.println("b is greater than a");
		}
		
	}
	
	public void eve()
	
	{
		int a,b;
		int c;
		a=4;
		b=2;
		c=a%b;
		
		if(c==0)
			
			
		{
			System.out.println("a is even");
			
		}
		else
		{
			System.out.println("a is odd");
		
			
		}
		
	}
	
	
	public void test()
	
	{
		int a,max;
		a=7;
max=a%2;
		String d=max==0?"even":"not even";
	System.out.println(d);
		
	}
	
	public static void main(String args[])
	
	{
		
		Opss obj=new Opss();
		obj.cond();
		obj.cond1();
		obj.eve();
		obj.test();


	}
	
}
