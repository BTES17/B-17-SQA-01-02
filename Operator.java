package Roman;

public class Operator {
	
	
      void change()//float to int
		{
 
   float b;
   b=2.0f;// by default 2.0 is double so need to convert double to float first.
   
   int a;
   
   
   a=(int)b;
  
   
   System.out.println(a);
		}
		 
      void change1()//int to float
		{
    int a=2; 
    float b;
    
    b=a;
    
     
 System.out.println(b);
		}
      
      
      void change2()//char to int
		{
    	  char a='s';
          int b;
          b=a;
  
  
System.out.println(b);
		}
    
      void change3()//int to char
		{
int a=97; 

char b;


 b=(char)a;


System.out.println(b);
		}
      void change4()//char to float
		{
 

char b='k';
float a;

a=b;


System.out.println(a);
	
      
		}
      
      void change5()//float to char
		{

float a=97.0f;
char b;

b=(char)a;


System.out.println(b);
	
    
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Operator Obj=new Operator();

Obj.change();
Obj.change1();
Obj.change2();
Obj.change3();
Obj.change4();
Obj.change5();


	}

}
