/**
 * Created by RahulMehta on 3/29/2017.
 *
 * Write a program to input electricity unit charges and calculate total electricity bill according to the given condition:
 For first 50 units Rs. 0.50/unit
 For next 100 units Rs. 0.75/unit
 For next 100 units Rs. 1.20/unit
 For unit above 250 Rs. 1.50/unit
 An additional surcharge of 20% is added to the bill
 */
public class Bill {

    public void bijli() {
        double units, bills, total;
        units = 250;

        if (units >= 0 && units <= 50)

        {
            bills = units * 0.50;
            total = (bills * 0.20) + bills;
            System.out.println("The total bill is " + total);

        } else if (units >= 50 && units <= 150)

        {
            bills = units * 0.75;
            total = (bills * 0.20) + bills;
            System.out.println("The total bill is " + total);

        } else if (units >= 150 && units <= 250)

        {
            bills = units * 1.20;
            total = (bills * 0.20) + bills;
            System.out.println("The total bill is " + total);

        } else if (units > 250)

        {
            bills = units * 1.50;
            total = (bills * 0.20) + bills;
            System.out.println("The total bill is " + total);

        }

    }

public static void main(String args[])
{
    Bill Obj=new Bill();
    Obj.bijli();


}

}
