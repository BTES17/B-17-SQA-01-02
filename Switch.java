
public class Switch {
public void switch1()
{
	String day="Tuesday";
	switch (day)
	{
	case "Sunday":
	{
		System.out.println("Sunday is holiday");
		break;
	}
	
	case "Monday":
	{
		System.out.println("Monday is Study day");
		break;
	}
	case "Tuesday":
	{
		System.out.println("Tuesday is enjoying day");
		break;
	}
	case "Wednesday":
	{
		System.out.println("Wednesday is non vegeterian day");
		break;
	}
	case "Thursday":
	{
		System.out.println("Thursday is vegiterian day");
		break;
	}
	case "Friday":
	{
		System.out.println("Friday is super day");
		break;
	}
	case "Saturday":
	{
		System.out.println("Saturday is movie day");
		break;
	}
	default:
	
		System.out.println("Invalid day");

	
	}
}
	public static void main (String args[])
	{
		Switch obj=new Switch();
		obj.switch1();
	}
		
		
}
