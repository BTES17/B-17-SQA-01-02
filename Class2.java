
public class Class2 {
	
	public void operator()
	{
    int a,b,c;
	a= 10;
	b=5;
	System.out.println(a++);
	System.out.println(++a);

	if(a>b)
	System.out.println(b--);
	else
    System.out.println(--b);
	}
	//program using conditional operator 
	
	{
		int a;
		a=5;
		String c= (a%2==0)? "even":"odd";
		System.out.println(c);
				
				
	}
	public static void main(String args[])
	{
	Class2 object = new Class2();
	object.operator();
	
	
	}
}