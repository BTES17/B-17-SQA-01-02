package Roman;

import java.util.Scanner;

public class Student {
	int i;
	Scanner Scan=new Scanner(System.in);
	{
	System.out.println("Enter no. of student detail you want to enter");
	}
	int size=Scan.nextInt();

	int [] rollno=new int [size];
	int [] marks=new int[size];
	String college;
	String name;

	

	void add()
	{
		
		

		
		for(i=0;i<size;i++)
		{
		
			System.out.println("Enter name of students");
			for(i=0;i<size;i++){
	
	 name =Scan.nextLine();
	
			}
	System.out.println("Enter roll no. of students");
	
	for (i=0;i<size;i++)
	{
		rollno[i]=Scan.nextInt();
	}
	System.out.println("Enter marks of students");
	
	for (i=0;i<size;i++)
	{
		marks[i]=Scan.nextInt();
	}
	System.out.println("Enter college name");
	
	for (i=0;i<size;i++)
	{
		college=Scan.nextLine();
	}
		}
	
		}
		
		void display()
		{
			for(i=0;i<size;i++)
			{
			
				System.out.println("Entered detail of Students"+name+" "+rollno[i]+" "+marks[i]+" "+college);
		
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj=new Student();
		//Student obj1=new Student();
		//Student obj2=new Student();
		//Student obj3=new Student();
		//Student obj4=new Student();
		obj.add();
		obj.display();
		
		

	}

}
