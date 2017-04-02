/**
 * Created by RahulMehta on 4/2/2017.
 */
import java.util.Scanner;
public class AddDigits {

    public void abc()
    {
        int a,n,sum=0;
        System.out.println("Enter the number for which digits are supposed to be added");
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();


       while(n!=0)
        {
        a=n%10;
        n=n/10;
        sum=sum+a;
        }
       System.out.println("The sum of digits is"+sum);



    }

    public static void main(String args[])
    {

        AddDigits Obj=new AddDigits();
        Obj.abc();
    }


}
