
public class Poly1 {
	void add (int a,int b)
	{
	  int c =a+b;
	  System.out.println(c);
		
	} 
	void add (float a, float b)
    {
     float c= a+b;
	System.out.println(c);
	
	 
    }
	public static void main(String args[])
	{
		Poly1 obj = new Poly1 ();
		obj.add(5,5);
		obj.add(5f,5f);
		
		
	}
}



