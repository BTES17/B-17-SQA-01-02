
public class Stat {
	static int e=10;int a2;
	
	static{
		int a=10;
		int b=15;
		int c=a+b;
	System.out.println("This is a static block");
	//System.out.println(a2); Static variable can be used in non static.
	//however non static can not be used in static.
		}
	static{
		System.out.println("This is the second static block");
		
	}

	public void Static() {
	
		System.out.println("The value of e is changed as "+e);
					}
	
	public void Static1() {
		
		System.out.println("This is a void method");
		e=e+1;
		System.out.println("The value of e is "+e);
	}
	
	
	
	public static void main(String args[])
	{
		Stat Obj=new Stat();
		Stat Obj1=new Stat();
		Obj.Static();
		Obj.Static1();
		System.out.println("This is the main method");
	}
	}
