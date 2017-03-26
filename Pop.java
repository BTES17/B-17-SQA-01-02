/**
 * Created by RahulMehta on 3/26/2017.
 */
public class Pop {

    public void abc()

    {

        int a,b,c,d;
        a=5;
        b=7;
        c=a;
        d=b;
        b=c;
        a=d;

        System.out.println(a);
        System.out.println(b);

    }

//Now only one temporary variable would be used.

    public void abcd1()

    {

        int a,b,c;
        a=5;
        b=7;
        System.out.println("a is "+a);
        System.out.println("b is "+b);

        c=a;
        a=b;
        b=c;
        System.out.println("Now a is "+a);
        System.out.println("Now b is "+b);

    }

    public static void main(String args[])
    {
        Pop Obj=new Pop();
        Obj.abc();
        Obj.abcd1();


    }

}



