import java.util.Scanner;

public class Sum2 {
	public void num1()
    {
        int a,i,Sum,b;
        Sum=0;
        System.out.println("Enter the number");
        Scanner scan=new Scanner(System.in);
        a = scan.nextInt();
        for (i=1;i<=a;i++)
        {
            b=i*i;
            System.out.println("The square of number is "+b);
            Sum=Sum+b;

        }

        System.out.println("The sum is "+Sum);

    }

    public static void main(String args[]) {
        Sum2 Obj = new Sum2();
        Obj.num1();
    }

}
