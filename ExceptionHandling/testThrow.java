package ExceptionHandling;

import java.util.Scanner;

public class testThrow {
	public static void main(String[] args) {
		Scanner x= new Scanner(System.in);
		int n= x.nextInt();
		try{
			Throw.election(n);
		}
		catch(ArithmeticException e){
			System.out.println("Result: "+e);
		}
	}
}
