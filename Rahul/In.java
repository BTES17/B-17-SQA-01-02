
 class Second {

	public void first() {
		
		System.out.println("This is the inherited class");
		
	}

}



 public class In extends Second
{
	public static void main(String args[])
	{
	Second Obj=new Second();
	Obj.first();
	}
}
