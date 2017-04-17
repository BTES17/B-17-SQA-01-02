
 class Inherit2 {
		final int a=10;
	public void Inherit1() {
		System.out.println(a);
		System.out.println("This is the class which is going to be inherited");
		
	}	
}
 final public class Inherit extends Inherit2
{
	public void Inherit1()
	{
		int a=5;
		System.out.println(a);
System.out.println("This is the class in which one class would be inherited");	
super.Inherit1();
	}
	
	public static void main(String args[])
	{
		Inherit Obj=new Inherit();
		Obj.Inherit1();
		
		
	}
	
	
}
