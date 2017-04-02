package Roman;

import java.util.Scanner;

public class oddseries {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i=1,N;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number ");
		N=scan.nextInt();
		
		while (i<=N) {
			System.out.print(" "+i);
			i=i+2;
		}
	}

}
