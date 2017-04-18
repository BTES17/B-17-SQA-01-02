package MyPack1;

 class  DemoChild implements DemoParent {
	 public void abc1()
	 {
		 System.out.println("output when method is abstract");
	 }
	 public void abc2()
	 {
		 System.out.println("output when method is by default abstract");
	 }
	 public static void main(String args[])
	 {
		 DemoParent obj = new DemoChild();
		 obj.abc1();
		 obj.abc2();
		
	 }
	 

}
