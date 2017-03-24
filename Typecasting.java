
public class Typecasting {
	void implicit()
	{
		int a;
		a=50;
		float b;//conversion of integer value to float 
		b=a;
		System.out.println(b);
	}
	void explicit()
	{
		float a;
		a=50.5f;  //conversion of float value to integer value
		int b;
		b= (int)a;
		System.out.println(b);
				
	}
	void implicit1()
	{
		char a;
		a='M';   //conversion of character to integer value eg. M=77 in case of inetger
		int b;
		b=a;
		System.out.println(b);
	}
	 void explicit1()
	{
		int a;
		a=77;   // conversion of integer to character
		char b;
		b=(char)a;
		System.out.println(b);
	}
	 void explicit2()
	 {
		float f;
		f=97;
		char c;  //conversion of float to character
		c=(char)f;
		
	System.out.println(c);
	 }
	 void implicit2()
	 {
		 char a;
		 a='A';
		 float f; // conversion of character to float using implicit method or automatically
		 f=a;
		 System.out.println(f);
	 }
	public static void main (String args[])
	{
		Typecasting obj=new Typecasting();
		Typecasting obj1=new Typecasting();
		Typecasting obj2=new Typecasting();
		Typecasting obj3=new Typecasting();
		Typecasting obj4=new Typecasting();
		Typecasting obj5=new Typecasting();
		obj.implicit();
		obj1.explicit();
		obj2.implicit1();
		obj3.explicit1();
		obj4.explicit2();
		obj5.implicit2();
	}

}
