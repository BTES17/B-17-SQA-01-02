 abstract class SSA {
	int a;
	abstract void hello();
		}

public class Implement extends SSA
{
	public void hello()
	{
				a=6;
				System.out.println(a);
	}
	public static void main(String args[])
	{
		SSA Obj=new Implement();
		Obj.hello();
	}
	
}