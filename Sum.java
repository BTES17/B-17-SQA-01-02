/**
 * Created by RahulMehta on 4/4/2017.
 * WAP to find the sum of all elements in 2D array
 */
import java.util.Scanner;
public class Sum {

    public void toodee() {
        int n, i, j, rowsize, colsize, s = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of the rows");
        rowsize = scan.nextInt();
        System.out.println("Enter the number of columns");
        colsize = scan.nextInt();
        int[][] array = new int[rowsize][colsize];
        System.out.println("Enter the elements in the array");
        for (i = 0; i < rowsize; i++) {
            for (j = 0; j < colsize; j++) {
                array[i][j] = scan.nextInt();
                s = s + array[i][j];
            }
        }
        System.out.println("The sum of the elemets is " + s);
    }

    public static void main(String args[]) {

        Sum Obj = new Sum();
        Obj.toodee();

    }
}
