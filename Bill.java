//Write a program to input electricity unit charges and calculate total electricity bill according to the given condition:
                 //   For first 50 units Rs. 0.50/unit
                //    For next 100 units Rs. 0.75/unit
                 //   For next 100 units Rs. 1.20/unit
                  //  For unit above 250 Rs. 1.50/unit
                   // An additional surcharge of 20% is added to the bill 
                    
public class Bill {

void billing()
	{
	int a=51;float c1; float d1;float e1; ;float f1; 
	{
		if(a>=0 && a<=50 )
		{
			float c=(float)0.50*a;
			
			c1=(float) (c+0.20*(c));
			
			System.out.println("Total bill in RS :"+c1);
		}
		
		
		else if(a>=51 && a<=150)
		{
		float	d= (float) (0.50*a+(a-50)*0.75);
			
			d1=(float) (d+0.20*(d));
			
			System.out.println("Total bill in RS :"+d1);
			
		}
		else if(a>=151&& a<=250)
		{
		float	e=(float)(0.50*a+(a-50)*0.75+(a-150)*1.20);
			e1=(float) (e+0.20*(e));
			System.out.println("Total bill in RS :"+e1);
		}
		else if(a>=251)
		{
			float f=(float)(0.50*a+(a-50)*0.75+(a-150)*1.20+(a-250)*1.50);
			f1=(float) (f+0.20*(f));
			System.out.println("Total bill in RS :"+f1);
		}
		
		
	}
	}
	public static void main(String[] args) {
		
	
		
	Bill object=new Bill();
		object.billing();

	}
}

