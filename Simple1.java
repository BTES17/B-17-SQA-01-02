
public class Simple1 {
	
	public void operator()
	{
    int a,b,c;
	a= 2;
	b=5;
	System.out.println("Answer for a++=" +(a++));
	System.out.println("Answer for ++a=" +(++a));

	if(a>b)
	System.out.println("Answer for b--="+(b--));
	else
    System.out.println("Answer for --b="+(--b));
	}
	//program using conditional operator 
	
	{
		int a;
		a=5;
		String c= (a%2==0)? "even":"odd";
		System.out.println("Amongest three only printed final result either even or odd="+(c));
				
				
	}
	public static void main(String args[])
	{
	Simple1 object = new Simple1();
	object.operator();
	
	
	}
}
