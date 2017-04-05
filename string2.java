
// WAP to print "Hello Java" as "Java Hello". 
public class string2 {
	public static void main(String args[]){  
		String s1="Hello Java";  
		
		{
			char[] ch=s1.toCharArray();  
			for(int i=0;i<ch.length;i++){  
		    System.out.print(ch[i]);
			
		}
			System.out.println();
			char[] charArrays = new char[]{'J', 'a', 'v', 'a', 'H', 'e','l','l','o'};
			String newString = new String(charArrays);
	        System.out.println("newString : " + newString);
			
			
	}
	}
}
    