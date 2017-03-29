/**
 * Created by RahulMehta on 3/29/2017.
 *  WAP to enter the value in integer N through keyborad and print the series of the square of natural number upto N number of elements. like if you have enter 5 then square of first five natural number should be printed as 1 4 9 16 25.

 */
import java.util.Scanner;
public class Square {

    public void num()
    {
        int a,i,n,b;
        System.out.println("Enter the number for which square is to be calculated");
        Scanner scan=new Scanner(System.in);
        a = scan.nextInt();
        for (i=1;i<=a;i++)
        {
            b=i*i;
            System.out.println("The square of subsequent number is "+b);

        }



    }

    public static void main(String args[]) {
        Square Obj = new Square();
        Obj.num();
    }

}
