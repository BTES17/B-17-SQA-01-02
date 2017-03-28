package Roman;

public class Greatest {

	void grt()
	{
		int a=4; int b=7; int c=8;
		
		if (a>b && a>c)
		{
			System.out.println("a is greater" );
		}
	
		else if (b>c)
		{
			System.out.println("b is greater");
		}
		else if (c>b)
		{
			System.out.println("c is greater");
		}
		
	}
	
	void grt1()
	{
		int a=9; int b=14; int c=12;
		
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
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Greatest object=new Greatest();
		object.grt();
		Greatest object1=new Greatest();
		object1.grt1();
		

	}

}
