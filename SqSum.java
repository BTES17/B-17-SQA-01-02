/**
 * Created by RahulMehta on 3/29/2017.
 */




    import java.util.Scanner;
    public class SqSum {

        public void num1()
        {
            int a,i,Sum,b;
            Sum=0;
            System.out.println("Enter the number for which square is to be calculated");
            Scanner scan=new Scanner(System.in);
            a = scan.nextInt();
            for (i=1;i<=a;i++)
            {
                b=i*i;
                System.out.println("The square of subsequent number is "+b);
                Sum=Sum+b;

            }

            System.out.println("The sum is "+Sum);

        }

        public static void main(String args[]) {
            SqSum Obj = new SqSum();
            Obj.num1();
        }

    }


