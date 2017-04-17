// Polymorphism havaing same method but different parameter
public class Polymorphism {
	void poly(int a)
	{
		
		
		System.out.println(a);
	}
	void poly(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	void poly(int a,int b, int c)
	{
		
		int z=a+b+c;
		System.out.println(z);
	}
	public static void main(String args[])
	{
		Polymorphism obj = new Polymorphism();
		obj.poly(3);
		obj.poly(3,5);
		obj.poly(3,9,7);
		
	}
	

}
