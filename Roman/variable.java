package mypackage;

public class variable {
int a=5, b=5;
	 void div()
	{
		int c=a/b;
		System.out.println("Default:"+c);
	}
	 private void div1()
	 {
		 int c=a/b;
			System.out.println("Private:"+c);
	 }
	
	 protected void div2()
	 {
		 int c=a/b;
			System.out.println("Protected:"+c);
	 }
	 public void div3()
	 {
		 int c=a/b;
			System.out.println("Public:"+c);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		variable obj2=new variable();
		obj2.div();
		obj2.div1();
		obj2.div2();
		obj2.div3();
	}

}
