
public class Myfirstclass {
	int a;
	int b;
public int add()
{
a=5;
b=3;
return a+b;
}
public int subtract()
{
	a=6;
	b=7;		
return a-b;
}
public void typecastingimplict(){
	int a;
	a=9;
	float b;
	b=a;	
	System.out.println(b);
}
public void typecastingexplicit(){
   float b;
   b=(float)6.6;
   int a;
   a=(int)b;
   System.out.println(a);

}  
public void typecastingimplict1()
{
	   char c;
	   c='y';
	   int a;
	   a=c;
	   System.out.println(a);
	   
}      
public void typecastingimplict2(){
	   int a;
	   a=6;
	   char c;
	   c=(char)a;
	   System.out.println(c);    
}
public void typecastingimplict3(){ 
	char a;
	a='d';
	float b;
	b=a;
	System.out.println(b);    
}
public void typecastingexplict4(){ 
	float a;
	a=60;
	char b;
	b=(char)a;
	System.out.println(b);
	}
public void typecastingimplicit4(){
	char a;
	a='j';
	float f;
	f=a;
	System.out.println(f);
}

public static void main (String args [])
{
Myfirstclass object1 = new Myfirstclass();
     int answer = object1.add();
     answer= object1.subtract();
     System.out.println(answer);
     object1.typecastingimplict();
     object1.typecastingexplicit();
     object1.typecastingimplict1();
     object1.typecastingimplict2();
     object1.typecastingexplict4();
     object1.typecastingimplicit4();
}
}