/**
 * Created by RahulMehta on 3/23/2017.
 */
public class Test {

    public void ifl()

    {
        int a;
        a=10;
        float b;
        b=a;
        System.out.println("B is float and is denoted by "+b);
       }


       public void fin()
       {
           float c;
           c=(float)99.99;
           int d;
           d=(int)c;
           System.out.println("Integer value of c i.e. 99.99 is "+d);
       }

       public void ich()
       {
           int e;
           e=90;
           char c;
           c=(char)e;
           System.out.println("Value of character c is "+c);
       }

       public void cin()
       {
         char f;
         f='f';
         int g;
         g=f;
         System.out.println("g is the integer value of a character and i.e. "+g);
         }

            public void cfl()
            {
                char h;
                h='h';
                float i;
                i=h;
                System.out.println("Float value of the input character is "+i);
           }

public void fch()
{
    float j;
    j=(float)105.23;
    char k;
    k=(char)j;
    System.out.println("Character value of input float is "+k);


}


public static void main (String args[])

{
    Test Obj=new Test();
    Obj.ifl();
    Obj.fin();
    Obj.ich();
    Obj.cin();
    Obj.cfl();
    Obj.fch();
}




}
