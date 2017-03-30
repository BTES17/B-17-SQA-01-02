  //WAP to print of the sum of all the squares obtain in above program. 

 import java.util.Scanner;
  public class Sum {
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
          Sum Obj = new Sum();
          Obj.num1();
      }

  }