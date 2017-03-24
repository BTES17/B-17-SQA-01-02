
public class NewClass {
	

	public void typecastingimplicit()
	{
	int a;
	a=8;
	float b;
	b=a;
	System.out.println(a);
	System.out.println(b);//conversion of integer to float
}

		public void typecastingexplicit()
		{	
		float f= 10.5f;
		int a= (int)f;
		System.out.println(f);//conversion of float to integer
		System.out.println(a);
		}
		public void typecastingimplicit1()
		
		{
		
			char ch;
			ch= 'a';
			int x =ch;
			System.out.println(x);//conversion of character to integer
		}
		public void typecastingexplicit1()
		{
			int y;
			y=67;
			char z;
			z= (char)y;
			System.out.println(y);//conversion of integer to character
			System.out.println(z);
		}
		public void typecastingexplicit2()
		{
			float f;
			f=98;
			char c;
			c=(char)f;
			System.out.println(c);//conversion of float to character
		}
		public void typecastingimplicit2()
		{
			char a;
			a='C';
		    float f;
			f=a;
			System.out.println(f);// conversion of character to float
		}
			
		
		
	public static void main(String args[])
	{
		NewClass object= new NewClass();
		object.typecastingimplicit();
	NewClass object1= new NewClass();
	object1.typecastingexplicit();
	NewClass object2 = new NewClass();
	object2.typecastingimplicit1();
	NewClass object3= new NewClass();
	object3.typecastingexplicit1();
	NewClass object4= new NewClass();
	object4.typecastingexplicit2();
	NewClass object5= new NewClass();
	object5.typecastingimplicit2();
	}
	
	}
