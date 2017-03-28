package ishaan;

public class ishaan
{
	public static void main(String[] args) 
	{
		int a=8,c=4,d=3,e;
		String b=(a%2==0)?"even":"odd";
		System.out.println(b);
		if(c<d)
		{
			System.out.println("d is greatest");
		}
		else
		{
			System.out.println("c is greatest");
		}
		System.out.println(a++);
		System.out.println(++a);
		e=(c++*c--);
		System.out.println(e);
		{
			int f=9,g=10,h=8;
			if(f>g&&f>h)
			{
				
			
				System.out.println("f is greatest");
		   }
			else if(g>h)
			{
				System.out.println("g is greatest");
			}
			else
			{
				System.out.println("h is greatest");
			}
		}
		int x=10,y=9,z=12;
		String greatest=(x>y&&x>z)?"x":(y>z)?"y":"z";
		System.out.println(greatest);
		{
			int m=70,n=80,o=20;
			if(m>n&&m>o)
			{
				System.out.println("m is greatest");
		   }
		
			else
			{
				if(n>o)
				System.out.println("n is greatest");
				else
			    System.out.println("o is greatest");
		}}
	}
}
