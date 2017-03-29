/**
 * Created by RahulMehta on 3/30/2017.
 * WAP to print Odd series upto N. 
 */


import java.util.Scanner;
public class Odd {


    public void od()

    {

        int a,b,c;
        System.out.println("Enter the number");
        Scanner scan=new Scanner(System.in);
        a=scan.nextInt();
        if(a%2==0)
        {
            System.out.println("This is an even number, try running the program again with odd number");


        }
else

        {
            for (b=1; ; b=b+2)

            {
                c=b;
                System.out.println(c);

            }
        }


    }
    public static void main(String args[])
    {
    Odd Obj=new Odd();
    Obj.od();

}
}
