
public class Calc {
public void cal()
	
	{
		int a, b;
		a=15;
		b=5;
		String oper = "-";
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
		Calc obj=new Calc();
		obj.cal();

	}

}


