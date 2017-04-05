/**
 * Created by RahulMehta on 4/5/2017.
 * practicse revrese(), toupercase(), tolowercase(), trim(), contains(), equals(), ==, length(),
 subString, chartoArray() and valueof() methods .
 */
import java.util.Scanner;
import java.lang.String;
public class Multi {

    public void abc()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the String");
        String a=scan.nextLine();
        System.out.println("The entered string is"+a);
        String b=a.toUpperCase();
    System.out.println("Uppercase is "+b);

    String c=a.toLowerCase();
    System.out.println("in lowercase the word is "+c);

    String d=a.trim();
        System.out.println("After trimming the space, the word is now "+d);
        System.out.println("Enter the word to check equality");
        String e=scan.nextLine();
        boolean f=a.equals(e);
        System.out.println(f);
        int g=a.length();
        System.out.println("The length of first string is "+g);

String h=a.substring(2,8);
System.out.println(h);

    }

    public static void main(String args[])
    {
        Multi Obj=new Multi();
        Obj.abc();

    }


}
