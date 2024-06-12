package Exceptions;

public class ExceptionTest {

	public static void main(String[] args) {
		
	int a[]=new int[3];
	
	
	a[0]=123;
	a[1]=123;
	a[2]=123;
	
	try {
		System.out.println("Hello");
		int i =10;
		int j=0;
		int k = 1/j;
		System.out.println(k);
		System.out.println("Hello");
	} catch(Exception e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
	finally {
		
		System.out.println("Mandatory");
	}

		
	//System.out.println(a[2]);	
		
		
	

	}
	
	//Exceptions Examples:
	/*

RuntimeException
IOException
IndexOutOfBoundsException
FileNotFoundException
SocketException
ArrayIndexOutOfBoundsException
IllegalArgumentException
ArithmeticalException EX: divide by zero
NumberFormatException




Error Examples: 

OutOfMemoryError
StackOverflowError
LinkageError



*/
}
