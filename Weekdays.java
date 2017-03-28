package Roman;

public class Weekdays {

	
	void day()
	{
		 String Day="Th";
		
		switch(Day)
		{
		case "Mo":
		{
		
			System.out.println("Its Monday");
			break;
		}
		case "Tu":
		{
			
			System.out.println("Its Tuesday");
			break;
		}
		case "We":
		{
			
			System.out.println("Its Wednesday");
			break;
		}
		case "Th":
		{
			
			System.out.println("Its Thursday");
			break;
		}
		case "Fr":
		{
			
			System.out.println("Its Friday");
			break;
		}
		case "Sa":
		{
			
			System.out.println("Its Saturday");
			break;
		}
		case "Su":
		{
			
			System.out.println("Its Sunday");
			break;
		}
		default:
		{
			System.out.println("invalid day code");
		}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method 
		
		Weekdays object= new Weekdays();
		
		object.day();

	}

}
