
public class sorting {
	public static void main(String args[])
	{
		int temp;
		int a[]=new int[]{10,9,7,2,1};
	    for(int i=0;i<a.length;i++)
	    {
	    	for(int j=i+1;j<a.length;j++)
	    	{
	    		if (a[i] > a[j])
	    	
	    		{
	    			temp=a[i];
	    			a[i]=a[j];
	    			a[j]=temp;
	    		}
	    	}
	    	}
	    System.out.println("sorted array is:");
	    for(int j=0;j<a.length;j++)
	    {
	    	System.out.println(a[j]);
	    }
	}

	
}
	