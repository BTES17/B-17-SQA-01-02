package MyPack1;

public abstract class AbstractParent {
	abstract void method();
	int a=40;
	static void method1()
	{
		int a=5;
		int b=5;
		int c = a*b;
		System.out.println(c);
	}
	public static void main (String args[])
	{
		method1();
	}

}
