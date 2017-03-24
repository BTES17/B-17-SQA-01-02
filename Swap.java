
public class Swap {
	
	public void Swapping()
	{
		int a,b,temp;
		
	a= 5;
	b=7;
	System.out.println("Before Swapping a is = " +a);
	System.out.println("Before Swapping b is =" +b);
    
    temp=a;
	a=b;
	b= temp;
	System.out.println("After Swapping value of a is ="  +a);
    System.out.println("After Swapping value of b is ="  +b);
}
	public static void main(String args[])
	{
		Swap object= new Swap();
		object.Swapping();
	}
}