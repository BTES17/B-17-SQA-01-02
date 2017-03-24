
public class Swapping {
	
	public void Swap()
	{
		int a,b;
		
	a= 20;
	b=10;
	System.out.println("Before Swapping a is = " +a);
	System.out.println("Before Swapping b is =" +b);
	
	a = a + b;
    b = a - b;
    a = a - b;
   
    System.out.println("After Swapping value of a is ="  +a);
    System.out.println("After Swapping value of b is ="  +b);
}
	public static void main(String args[])
	{
		Swapping object= new Swapping();
		object.Swap();


}
}