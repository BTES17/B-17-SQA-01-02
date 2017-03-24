
public class Swap1 {
	public void Swap()
	{
		int x,y,temp;
		
	x= 10;
	y=5;
	System.out.println("Before Swapping x is = " +x);
	System.out.println("Before Swapping y is =" +y);
    
    temp=x;
	x=y;
	y= temp;
	System.out.println("After Swapping value of x is ="  +x);
    System.out.println("After Swapping value of y is ="  +y);
}
	public static void main(String args[])
	{
		Swap1 object= new Swap1();
		object.Swap();
	}
}

