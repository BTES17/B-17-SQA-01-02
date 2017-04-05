// Practicse revrese(), toupercase(), tolowercase(), trim(), contains(), equals(), ==, length(),
   // subString, chartoArray() and valueof() methods . 
public class string1 {
	public static void main(String args[])
	{
		String s1= "hello java";
		String s1upper=s1.toUpperCase(); // using touppercase ()
		System.out.println(s1upper);  
	
	//
	
	String s2= "HELLO JAVA ";
	String s2lower=s2.toLowerCase(); // using tolowercase ()
	System.out.println(s2lower);
	//
	String s3= "   HELLO JAVA             ";// using trim()
	 
	System.out.println(s3.trim()+"hellojava");
	
	//
	String s4= "hello java";
	System.out.println(s4.contains("java"));// using contains ()
	System.out.println(s4.contains("java is a programming language"));
	
	//
	String s5 = "hello java";
	String s6 = "hello java";// using equals()
	System.out.println(s5.equals(s6));
	
	//
	String s7 = "java";
	String s8 = "helo";
	System.out.println(s7==(s8));// using ==()
	//
	String s9 ="hello java";
	System.out.println("string length is: "+s9.length());// using length()
	
	//
	String s10 = "hello java";
	System.out.println(s10.substring(2,7));//using substring()
	
	// 

	String s11="hello";  
	char[] ch=s11.toCharArray();  //using toCharArray ()
	for(int i=0;i<ch.length;i++)
	{  
	System.out.print(ch[i]);  

}
	
	}
}
