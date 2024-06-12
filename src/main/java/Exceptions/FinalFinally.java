package Exceptions;

public class FinalFinally {
	final int a = 100;

	public static void main(String[] args) {
	
		FinalFinally c = new FinalFinally();
		c.add();
		System.out.println(c.a);
		c.a=200;
		System.out.println("Child Addition");

	}

	
	public void add() {
		System.out.println("Child Addition");
		
	}
	
	
	//finally is about try catch finally block
	
	
	// finalize method is a protected method of java.lang.Object class
	
	//finalize() method is used to perform some clean up operations on an object
	//before it is removed from the memory
	
}
