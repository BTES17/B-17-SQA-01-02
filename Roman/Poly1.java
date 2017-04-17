package Roman;

//when no. of parameters are same but data type is different.

public class Poly1 {

	
	
	/*void method(int a,int b)
	{
		System.out.println("int:"+a+" "+b);
	}*/
void method(float a, float b)
{
	System.out.println("Float:"+a+" "+b);

}
void method(double a,double b)
{
	System.out.println("Double"+a+" "+b);

}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Poly1 obj=new Poly1();
		obj.method(1,2);
	//	obj.method(2.5f,3.6f);
	//	obj.method(1.2,1.3);

	}

}
