package Roman;

public class Calculator {

	
	void calc()
	{
		int a=6; int b=3; int c; String operation="/";
		
		switch(operation)
		{
		case "*":
		{
			c=a*b;
			System.out.println(c);
			break;
		}
		case "+":
		{
			c=a+b;
			System.out.println(c);
			break;
		}
		case "-":
		{
			c=a-b;
			System.out.println(c);
			break;
		}
		case "/":
		{
			c=a/b;
			System.out.println(c);
			break;
		}
		default:
		{
			System.out.println("invalid operation");
		}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator object= new Calculator();
		object.calc();

	}

}
