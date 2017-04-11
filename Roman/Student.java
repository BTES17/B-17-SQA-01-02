package pooja;

	import java.util.Scanner;

	public class Student {
	
		

		int rollno;
		int marks;
		
	static 	String college;
	
		String name;

	Scanner Scan=new Scanner(System.in);

		void add()
		{
			
			

			
				System.out.println("Enter name of students");
			
		
		 name=Scan.next();
		
				
			
		System.out.println("Enter roll no. of students");
		
		
		
			rollno=Scan.nextInt();
		
		System.out.println("Enter marks of students");
		
		
		
			marks=Scan.nextInt();
		
		
			
		
			}
	static	void collegename(String collegename)
		{
			
			
			college=collegename;
		
		}
			
			void display()
			{
				
				
					System.out.println("Entered detail of Students"+name+" "+rollno+" "+marks+" "+college);
			
			
				
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner Scan=new Scanner(System.in);
			 
			System.out.println("Enter no. of student detail you want to enter");
			collegename("ABC College");
			int size=Scan.nextInt();
			Student obj[]=new Student[size];
			int i=0;
			for(i=0;i<size;i++)
			{
				obj[i]= new Student();
			obj[i].add();
			obj[i].display();
			}
			
			

		}

	}

