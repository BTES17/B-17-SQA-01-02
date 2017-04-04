/**
 * Created by RahulMehta on 4/4/2017.
 * WAP to print enter values in 2 D array and print the array as matrix
 */

import java.util.Scanner;
public class TwoD {

    public void toodee()
    {
        int n,i,j,rowsize,colsize;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of the rows");
        rowsize=scan.nextInt();
        System.out.println("Enter the number of columns");
        colsize=scan.nextInt();
        int[][] array=new int[rowsize][colsize];
System.out.println("Enter the elements in the array");
        for(i=0;i<rowsize;i++)
        {
            for(j=0;j<colsize;j++)
            {
             array[i][j]=scan.nextInt();
            }
        }
        for(i=0;i<rowsize;i++)
        {
            for(j=0;j<colsize;j++)
            {
                System.out.print(" "+array[i][j]);
            }
            System.out.println("");
        }

    }

    public static void main(String args[])
    {
        TwoD Obj=new TwoD();
        Obj.toodee();

    }


}
