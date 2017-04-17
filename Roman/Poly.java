package Roman;
//1.when no. of parameters are different
public class Poly {
	
	void method(int a)
	{
		System.out.println(a);
	}
void method(int a, int b)
{
	System.out.println(a+" "+b);

}
void method(int a,int b, int c)
{
	System.out.println(a+" "+b+" "+c);

}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
Poly obj=new Poly();
obj.method(1);
obj.method(1,2);
obj.method(1,2,3);

	}

}
