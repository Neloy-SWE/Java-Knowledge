//use of finally keyword 

package ExceptionHandling;

public class Ex1v3 {
public static void main(String[] args) {
	try {
		int x = 0;
		int y= 10/x;
	}

	catch(ArithmeticException a){
		System.out.println("Arithmetic exception");
	}
	try {
		int [] z = new int [4]; 
		System.out.println(z[100]);
	}
	catch (ArrayIndexOutOfBoundsException a){
		System.out.println("Array index out of bounds exception");
	}
	
	finally {
		System.out.println("this is the last line of the program");
	}
}
}
