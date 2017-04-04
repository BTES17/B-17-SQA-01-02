/**
 * Created by RahulMehta on 4/4/2017.
 * WAP to find the sum of diagonal elements in 2D array
 */
import java.util.Scanner;
public class Diagonal {

    public void toodee() {
        int n, i, j, rowsize, colsize, s = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of the rows");
        rowsize = scan.nextInt();
        System.out.println("Enter the number of columns");
        colsize = scan.nextInt();
        int[][] array = new int[rowsize][colsize];
        System.out.println("Enter the elements in the array");
        for (i = 0; i < rowsize; i++)
        {
            for (j = 0; j < colsize; j++) {
                array[i][j] = scan.nextInt();

            }
        }

        for(i=0,j=0;i<rowsize,j < colsize ;i++,j++)

        {
            s=s+array[i][j];
        }
        System.out.println("The sum is"+s);

    }

    public static void main(String args[]) {

        Diagonal Obj = new Diagonal();
        Obj.toodee();

    }
}
