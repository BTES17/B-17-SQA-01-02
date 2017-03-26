/**
 * Created by RahulMehta on 3/26/2017.
 */
public class NoTemp {

    public void ntmp()

{

    int x,y;
    x=20;
    y=70;
    System.out.println("Value of x is "+x);
    System.out.println("Value of y is "+y);

    x=x+y;
    y=x-y;
    x=x-y;
    System.out.println("Now value of x is "+x);
    System.out.println("Now value of y is "+y);
}

public static void main(String args[])

{

    NoTemp Obj=new NoTemp();
    Obj.ntmp();b

}

}
