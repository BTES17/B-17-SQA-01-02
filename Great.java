
public class Great 

{

	public void three()
	
	{
		int a,b,c;
		a=5;
		b=7;
		c=4;
		
		if (a>b)
		{
			
			if (b>c)
				
			{
				
				System.out.println("a is the greatest number");
			}
			
		}
		
		else
		{
			if(b>c)
			{
				System.out.println("b is the greatest number");
			}
			else
			{
				System.out.println("c is greatest number");
				
			}
		}
	}
		
		public static void main(String args[])
		
		{
			
			Great obj=new Great();
			obj.three();
			
		}
		
	
}
