package Roman;

public class prime {

	// to check no. is prime or not
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int flag=0;
		int N=11;
		int i;
		for(i=2;i<N;i++)
		{
			if(N%i==0)
			{
				flag=1;
				System.out.println("Not prime");
				break;
			}
			
		}
		
		if(flag==0)
		{
			System.out.println("Prime");
		}
	}

}
