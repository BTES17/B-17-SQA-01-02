
public class Switch1 {

 
public void weekdays()
{
	String day="Monday";
	switch (day)
	{
	case "Sunday":
	{
		System.out.println("Today is Sunday");
		break;
	}
	
	case "Monday":
	{
		System.out.println("Today is Monday");
		break;
	}
	case "Tuesday":
	{
		System.out.println("Today is Tuesday");
		break;
	}
	case "Wednesday":
	{
		System.out.println("Today is Wednesday");
		break;
	}
	case "Thursday":
	{
		System.out.println("Today is Thursday");
		break;
	}
	case "Friday":
	{
		System.out.println("Today is Friday");
		break;
	}
	case "Saturday":
	{
		System.out.println("Today is Saturday");
		break;
	}
	default:
	
		System.out.println("Invalid day");
	}
	
	
}
	public static void main (String args[])
	{
		Switch1 obj=new Switch1();
		obj.weekdays();
	}
		
		



}
