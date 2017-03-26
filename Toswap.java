package Roman;

public class Toswap 

{
	int a=5, b=7, c;
	
	void swap()
	{
		
	c=b;
	b=a;
	a=c;
	
	System.out.println("Value of a after swap is " +a);
	System.out.println("Value of b after swap is " +b);
	
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Toswap Obj=new Toswap();
				Obj.swap();
			
			
	}

}
