
//  WAP to find that a number is Armstrong or not like sum of cube of 
 //digits is equal to the number itself 
          //EXAMPLE: 153 
         // 1+5*5*5+3*3*3=153

import java.util.Scanner;
public class Armstrong  
{ 
	void arm()
	{
		    int c=0,a,temp,x;  
		    int n=153; 
		    temp=n;  
		    while(n>0)  
		    {  
		    a=n%10;  
		    n=n/10;  
		    c=c+(a*a*a);  
		    }  
		    if(temp==c) 
		    {
		    System.out.println("armstrong number"); 
		    Scanner scan=new Scanner(System.in);
	          x = scan.nextInt();
		    }

		    else 
		    {
		        System.out.println("Not armstrong number"); 
		    }
	
	}
		    
		    public static void main(String[] args)
		    {
		    Armstrong obj=new Armstrong();
		    obj.arm();
		    }
		}  
