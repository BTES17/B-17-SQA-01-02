/**
 * Created by RahulMehta on 3/28/2017.
 */
public class Calc {

    public void calculator()

    {
       /* char c= '+';
        int a,b;
        a=10;
        b=5;
        switch(c)
        {

            case '+':


            {
                System.out.println("The sum is"+(a+b));

            }
        }*/

       int a,b,c;
        a=10;
        b=5;
        String d="Subtract";
        switch(d)

        {
            case "Add":
            {
                c=a+b;
                System.out.println("The sum of a and b is "+c);
                break;

            }

            case "Multiply":
            {
                c=a*b;
                System.out.println("The multiplication of a and b is "+c);
                break;

            }

            case "Divide":
            {
                c=a/b;
                System.out.println("The division of a and b is "+c);
                break;

            }

            case "Subtract":
            {
                c=a-b;
                System.out.println("The difference of a and b is "+c);
                break;

            }


        }


    }

    public static void main(String args[])

    {
        Calc Obj=new Calc();
        Obj.calculator();

    }

}
