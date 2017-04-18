package MyPack1;

public class AbstractChild extends AbstractParent {
	void method()
	{
		int a=10;
		int b=5;
		int c=a+b;
		System.out.println(c);
	}
	public static void main(String args[])
	{
		AbstractParent obj = new AbstractChild();
		obj.method();
	}
	

}
