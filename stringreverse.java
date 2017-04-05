//WAP to print "Hello Java" as " Avaj OlleH"
public class stringreverse {

	public static void main(String args[]){  
		String s1="Hello Java";  
		{
			char[] ch=s1.toCharArray();  
			for(int i=0;i<ch.length;i++){  
		    System.out.print(ch[i]);
		}
			System.out.println();
			char[] charArrays = new char[]{'A', 'v', 'a', 'j',' ', 'o', 'l','l','e','H'};
			String newString = new String(charArrays);
	        System.out.println("newString : " + newString);
}
	}
}
