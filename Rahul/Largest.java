/**
 * Created by RahulMehta on 5/9/2017.
 */
import java.util.Scanner;
public class Largest {

    public void find() {
        Scanner scan = new Scanner(System.in);
        int size = 5, b, i;
        int[] array = new int[size];
        for (i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }
        b=array[0];

        for (i = 0; i < size; i++) {

            if(b<array[i])
            {
                b=array[i];
            }
        }

        System.out.print(b);
        System.out.print(" is the largest number");

    }
    public static void main(String args[])
    {
        Largest obj=new Largest();
        obj.find();

    }




}
