
public class Poly {
	void add(int a)
	{
		
		
		System.out.println(a);
	}
	void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	void add(int a,int b, int c)
	{
		
		int z=a+b+c;
		System.out.println(z);
	}
	public static void main(String args[])
	{
		Poly obj= new Poly();
		obj.add(5,6);
			
	}

}
