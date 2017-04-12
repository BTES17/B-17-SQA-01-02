
public class Met {

	static void Met1() {
		System.out.println("This method has been called without object");
	}
	void dis()
	{
		abc();
		
	}
	
	public void abc()
	{
		System.out.println("This method has been called with object");
	}
	
	public static void main(String args[])
	{
		Met Obj=new Met();
				Met1();
				Obj.dis();
		
		
	}

}
