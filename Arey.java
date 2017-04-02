/**
 * Created by RahulMehta on 4/3/2017.
 */
import java.util.Scanner;
public class Arey {

    public void oye()

    {
        int size, i;

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        size=scan.nextInt();
        int[] array=new int[size];
        System.out.println("Entet the values in the array up to "+size);

        for(i=0;i<size;i++)
        {
            array[i]=scan.nextInt();


        }

     for(i=0;i<size;i++)
     {
         System.out.println(array[i]);

     }


    }
    public static void main(String args[])
    {
        Arey Obj=new Arey();
        Obj.oye();

    }

}
