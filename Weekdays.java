/**
 * Created by RahulMehta on 3/28/2017.
 */
public class Weekdays {

    public void days()

    {

        String a="Saturday";
        switch(a)
        {
            case "Monday":

            {
                System.out.println("Today is Monday :(");
                break;
            }

            case "Tuesday":

            {
                System.out.println("Today is Tuesday :(");
                break;
            }

            case "Wednesday":

            {
                System.out.println("Today is Wednesday :(");
                break;
            }


            case "Thursday":

            {
                System.out.println("Today is Thursday :(");
                break;
            }

            case "Friday":

            {
                System.out.println("Today is Friday :(");
                break;
            }

            case "Saturday":

            {
                System.out.println("Today is Saturday :(");
                break;
            }

            case "Sunday":

            {
                System.out.println("Today is Sunday :D");
                break;
            }

            default:
                {
    System.out.println("Invalid input, please try again with the day name");
}
        }


    }

public static void main(String args[])

{

   Weekdays Obj=new Weekdays();
   Obj.days();

}



}
