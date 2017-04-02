package Roman;

class fibonacci{  
	
	void series()
	{
	
	int a=0,b=1,c,i;    
	 System.out.print("series: "+a+" "+b);//printing 0 and 1    
	    
	 for(i=2;i<10;i++)//loop starts from 2 because 0 and 1 are already printed    
	 {    
	  c=a+b;    
	  System.out.print(" "+c);    
	  a=b;    
	  b=c;   
	 }
	}
public static void main(String args[])  


{   
 
	fibonacci object=new fibonacci();
	object.series();
 }    
  
}