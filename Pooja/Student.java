package ujval;

import java.util.Scanner;

public class Student {
	int Rollno;  
    String name;  
    float marks;  
    void add(int i, String n, float m) {  
        Rollno=i;  
        name=n;  
        marks=m;  
    }  
    void display(){
    System.out.println(Rollno+" "+name+" "+marks);}  

public static void main(String[] args) 
{  
    Student s1=new Student();  
    Student s2=new Student();  
    Student s3=new Student();  
    s1.add();  
    Scanner scan= new scanner(System.in);
    int r= scan.nextInt();
    System.out.println(r)
    s2.add(102,"irfan",25);  
    s3.add(103,"nakul",55);  
    s1.display();  
    s2.display();  
    s3.display();  
}  
}  


	