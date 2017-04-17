// Number of parameter are same Data type are same , sequence are different
public class Polymorphism2 {

	void poly (int a,float b)
	{
	  
	  System.out.println(a);
	  System.out.println(b);
		
	} 
	void poly (float a, int b)
    {
	
	System.out.println(a);
	 System.out.println(b);
	
	 
    }
	public static void main(String args[])
	{
		Polymorphism2 obj = new Polymorphism2 ();
		obj.poly(10,5f);
		obj.poly(10f,5);
		
		
	}
}



