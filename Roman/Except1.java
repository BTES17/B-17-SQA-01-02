package mypackage2;

public class Except1 {

	void voting(int age)throws Exception
	{
		if(age<18)
		{
			throw new ArithmeticException("Age is not valid");
		}
		
	}
	

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		Except1 obj=new Except1();
		
		try{
			obj.voting(19);
			try{
				System.out.println("you can vote");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		catch(Exception e )
		{
			System.out.println(e);
		}
		
		}
	}


