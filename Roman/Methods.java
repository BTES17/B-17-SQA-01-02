package pooja;

public class Methods {
	int a , b;
	int c=a+b;
	
	Methods(int a)
	{
		this.a=a;
		b=8;
		//System.out.println("Contructor1: "+a);
	}
	Methods(int a,int b)
	{
		//System.out.println("Contructor2 :"+(a+b));
	}
	void method(int a, int b)
	{
		
		int c=a+b;
		System.out.println(c);
	}
	
	int method1(int a, int b)
	{

		int c=a+b;
		return c;
	}
	int method2()
	{
		return c;
	}
	
	void method3()
	{
		System.out.println(a +" "+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	
		Methods obj2=new Methods(7);
		Methods obj1=new Methods(1,2);
		obj1.method3();
		//int g =obj1.method1(2,3);
		obj2.method3();
		//System.out.println(g);
		
		//int h =obj1.method2();
		//System.out.println(h);
		//obj1.method3();
	}

}
