/**
 * Created by RahulMehta on 4/3/2017.
 */

import java.util.Scanner;
public class Search {

    public void look()

    {
        Scanner scan = new Scanner(System.in);
        int size, i, a, b;
        System.out.println("Enter the elements in the array");
        size = scan.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the numbers in the array");
        for (i = 0; i < size; i++) {
            array[i] = scan.nextInt();

        }

        System.out.println("Enter the nunmber to find");
        a = scan.nextInt();
        for (i=0; i < size ;i++)
        {

            if (a == array[i])
            {
                System.out.println("The number is present in the array");
                break;
            }

        }
        if(i==size)
        {
            System.out.println("The number is not present in the array");

        }

    }

    public static void main(String args[])
    {
        Search Obj=new Search();
        Obj.look();
    }

}
