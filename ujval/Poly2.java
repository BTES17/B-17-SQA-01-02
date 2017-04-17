
public class Poly2 {
	void poly (int a,float b)
	{
	  
	  System.out.println(a+b);
	 
		
	} 
	void poly (float a, int b)
    {
	
	System.out.println(a+b);
	 
	
	 
    }
	public static void main(String args[])
	{
		Poly2 obj = new Poly2 ();
		obj.poly(10,5f);
		obj.poly(10f,5);
		
		
	}
}






