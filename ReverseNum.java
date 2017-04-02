/**
 * Created by RahulMehta on 4/2/2017.
 */
import java.util.Scanner;
public class ReverseNum {


    public void rev() {
        int n, r = 0;

        System.out.println("Enter the number for which reversal is needed");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();

        while (n != 0) {
            r = r * 10;
            r = r + n % 10;
            n = n / 10;

        }

        System.out.println("Reverse of entered number is "+r);
    }
        public static void main(String args[])

    {

        ReverseNum Obj= new ReverseNum();
        Obj.rev();
    }



}
