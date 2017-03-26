package Roman;

public class Toswap1 {

	public void Swap()
	{
		int x=5,y=7;
			
	x = x + y;
    y = x - y;
    x = x - y;
   
    System.out.println("After Swapping value of x is ="  +x);
    System.out.println("After Swapping value of y is ="  +y);
}
	public static void main(String args[])
	{
		Toswap1 object= new Toswap1();
		object.Swap();

	}

}
