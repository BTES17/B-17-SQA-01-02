//parameter same but data type different

public class Polymorphism1 
{
	void poly (int a,int b)
	{
	  int c =a+b;
	  System.out.println("Result while data type is integer =:" +c);
		
	} 
	void poly (float a, float b)
    {
	float c=a-b;
	System.out.println("Result while data type is flaot =: " +c);
	
	 
    }
	public static void main(String args[])
	{
		Polymorphism1 obj = new Polymorphism1 ();
		obj.poly(10,5);
		obj.poly(10f,5f);//explicitly done
		
		
	}
}
