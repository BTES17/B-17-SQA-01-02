
public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="Hello Java";
		int size=a.length();
		
		System.out.println("size:"+size);
		
		int b;
		char r9;
		for (b=size-1;b>=0;b--)
		{
			r9=a.charAt(b);
			System.out.print(""+r9);
			
		}
		}
		

}
