package Roman;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student1 implements Serializable{
	String name;
	int marks;
	int rollno;
	
	Student1(String name, int marks,int rollno)
	{
		this.name=name;
		this.marks=marks;
		this.rollno=rollno;
		
	}
	
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
Student1 s1=new Student1("Roman",5,1);

FileOutputStream fout=new FileOutputStream("Test.txt");
ObjectOutput out=new ObjectOutputStream(fout);
out.writeObject(s1);
fout.close();


	}

}
