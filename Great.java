/**
 * Created by RahulMehta on 3/28/2017.
 */
public class Great {


    public void grea()

    {
int a,b,c;
a=50;
b=50;
c=50;

if(a>b&&a>c)
{
    System.out.println("a is the greatest number");
}

else if (b>c)
{
    System.out.println("b is the greatest number");
}

else if (c>b)

{
    System.out.println("c is the greatest number");
}


else if (a==b&&b==c)

{
    System.out.println("All are same");

}
    }

public static void main(String args[])

    {
      Great Obj=new Great();
      Obj.grea();

    }


}
