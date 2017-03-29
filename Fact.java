/**
 * Created by RahulMehta on 3/29/2017.
 * Write a program to find factorial of number say number is 5 then factorial will be 1*2*3*4*5=120
 */

import java.util.Scanner;
public class Fact {

    public void facto()
    {
        int a,b,i,n;
        b=1;
        System.out.println("Enter the number for factorial");
        Scanner scan=new Scanner(System.in);
        a=scan.nextInt();
        for (i=1;i<=a;i++)
        {
         b=b*i;
        }
        System.out.println("Factorial is "+b);

    }
    public static void main(String args[]) {


        Fact Obj = new Fact();
        Obj.facto();
    }
}
