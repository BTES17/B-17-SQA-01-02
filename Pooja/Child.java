package MyPack;

 class Child extends Parent {
	 void abc()// error while create again same method name 
	              //same as parent class,,while use final keyword with method..
	 {            //  Cannot override the final method from Parent
		 
		 
	 }
	
	 

	 public static void main(String args[])
	 {
		 Child obj = new Child();
		 obj.abc();
	 }
	
}
 
