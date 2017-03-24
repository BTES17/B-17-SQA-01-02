
public class Swap2 {
	
		public void Swapping()
	{
		int x,y;
		
	x= 5;
	y=7;
	System.out.println("Before Swapping x is = " +x);
	System.out.println("Before Swapping y is =" +y);
	
	x = x + y;
    y = x - y;
    x = x - y;
   
    System.out.println("After Swapping value of x is ="  +x);
    System.out.println("After Swapping value of y is ="  +y);
}
	public static void main(String args[])
	{
		Swap2 object= new Swap2();
		object.Swapping();


}
}