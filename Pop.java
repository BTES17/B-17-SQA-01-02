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

    public static void main(String args[])
    {
        Pop Obj=new Pop();
        Obj.abc();


    }

}
