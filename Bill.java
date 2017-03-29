
public class Bill {
	public void Billing()
	{
 float x= 234;
if(x>=0 && x<=50)
{
	System.out.println("Bill generated is Rs " + ((x*0.05)+(0.2)));
}
else if (x>=51 && x<=150)
	{
	System.out.println("Bill generated is Rs " + ((x*0.75)+(0.2)));
}
else if (x>=151 && x<=250)
{
	System.out.println("Bill generated is Rs " +((x*1.20)+(0.2)));
}
else
{
	System.out.println("Bill generated is Rs " +((x*1.50)+(0.2)));
}
}
public static void main (String args[])
{
	Bill object= new Bill();
	object.Billing();
}
}
