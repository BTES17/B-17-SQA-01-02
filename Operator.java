
public class Operator {
	void oper()
	{
		int a;
		a=10;
		int b;
		b=5;
		System.out.println("Answer for a+b =" +(a+b));
		System.out.println("Answer for a-b =" +(a-b));
		System.out.println("Answer for a*b =" +(a*b));
		System.out.println("Answer for a/b =" +(a/b));
		System.out.println("Answer for a%b =" +(a%b));
		System.out.println("Answer for a<b =" +(a<b));
		System.out.println("Answer for a>b =" +(a>b));
		System.out.println("Answer for a<=b =" +(a<=b));
		System.out.println("Answer for a>=b =" +(a>=b));
		System.out.println("Answer for a==b =" +(a==b));
		System.out.println("Answer for a!=b =" +(a!=b));
		System.out.println("Answer for a+=b =" +(a+=b));
		System.out.println("Answer for a-=b =" +(a-=b));
		System.out.println("Answer for a*=b =" +(a*=b));
		System.out.println("Answer for a/=b =" +(a/=b));
		System.out.println("Answer for a%=b =" +(a%=b));
		System.out.println("Answer for a>b && a==b =" +( a>b && a==b));
		System.out.println("Answer for a>b || a==b =" +( a>b || a==b));
		System.out.println("Answer for a>b & a==b =" +( a>b & a==b));
		System.out.println("Answer for a>b | a==b =" +( a>b | a==b));
		System.out.println("Answer for a &=b  =" +( a &= b));
		
		
	}
	public static void main (String args[])
	{
		Operator object=new Operator();
		object.oper();
	}

}
