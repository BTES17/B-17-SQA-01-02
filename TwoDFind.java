import java.util.Scanner;

/**
 * Created by RahulMehta on 4/4/2017.
 *WAP to find an element in the 2 D array
 */
import java.util.Scanner;
public class TwoDFind {


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
            System.out.println("Enter the number that you want to search");
            n=scan.nextInt();
            for(i=0;i<rowsize;i++)
            {
                for(j=0;j<colsize;j++)
                {
                    if(n==array[i][j])
                    {
                        System.out.println("The number is present in the array");
                        break;
                    }
                }
            }

            if(i==rowsize)
            {
                System.out.println("The number is not present");

            }
        }

        public static void main(String args[])
        {
            TwoDFind Obj=new TwoDFind();
            Obj.toodee();

        }


    }

