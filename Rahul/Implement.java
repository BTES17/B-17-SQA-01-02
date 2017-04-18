
abstract class Hi {

	abstract void hello();
	
	public void hola()
	{
		System.out.println("HELLO");		
	}
}

class Namastay extends Hi{
	
	public void hello()
	{
		System.out.println("HI");
	}
	}
 class SSA extends Namastay{
	
	public void hello()
	{
		System.out.println("HI");
		super.hello();
	}
	}

public class Implement extends SSA
{
	public void hello()
	{
		System.out.println("HOLA");super.hello();
	}
	public static void main(String args[])
	{
		Implement Obj=new Implement();
		Obj.hello();
		Obj.hola();
			}
	
}