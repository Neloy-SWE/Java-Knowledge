package ExceptionHandling;

public class Ex1v2 {
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
}
}
/*
 *2 ta try block ke kokhonoi ek sathe lekha jai na tobe ei niom e ek ta 
 *try er jonno jei catch tar niche arek ta try dewa jete pare. 
 */
