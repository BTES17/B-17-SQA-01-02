package Roman;

import java.util.Scanner;
public class armstrong {

	
	
		void arm()
		{
			    int c=0,a,temp;  
			    int n; 
			    Scanner scan=new Scanner(System.in);
			    System.out.println("enter no. to find it is armstrong number or not"); 
		          n = scan.nextInt();
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
			    
			    }

			    else 
			    {
			        System.out.println("Not armstrong number"); 
			    }
		
		}
			    
			    public static void main(String[] args)
			    {
			    armstrong obj=new armstrong();
			    obj.arm();
			    }
			}  

