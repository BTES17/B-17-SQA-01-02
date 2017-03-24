
public class Swap2 {
	int a;
	public void Swapping()
	{
		int a,b;
		
	a= 5;
	b=7;
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
		Swap2 object= new Swap2();
		object.Swapping();


}
}