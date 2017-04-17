package Roman;

//when no. of parameters and data types are same but sequence is different
public class Poly2 {

void method(int a,float b)
	{
		System.out.println("int,Float: "+a+" "+b);
		
		
	}
void method(float a,int b)
{
	System.out.println("Float, Int: "+a+" "+b);

}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
Poly2 obj=new Poly2();
obj.method(1,2.2f);
obj.method(2.3f,3);
	}

}
