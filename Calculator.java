
public class Calculator {
	public void cal()
	
	{
		float a, b;
		a=3;
		b=5;
		String oper = "+";
		switch (oper)
		
		{
		case "+":
		{
			System.out.println(a+b);
			break;
		}
		
		case "-":
		{
	       System.out.println(a-b);
		break;
		}
		 case "*":
		 {
		System.out.println(a*b);
		break;
		 }
	case "/":
	{
		System.out.println(a/b);
		break;
	}
	default:
		System.out.println("invalid");
		}
	}
	
	public static void main (String args[])
	{
		Calculator obj=new Calculator();
		obj.cal();

	}

}
