package ExceptionHandling;

import java.util.Scanner;

public class testThrows {
	public static void main(String[] args) {
		Scanner x= new Scanner(System.in);
		int n= x.nextInt();
		try{
			Throws.election2(n);
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
}
