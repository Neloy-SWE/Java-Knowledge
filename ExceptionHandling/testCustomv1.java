package ExceptionHandling;

import java.util.Scanner;

public class testCustomv1 {
	public static void main(String[] args) {
		Scanner x= new Scanner(System.in);
		int n= x.nextInt();
		try{
			useCustom1v1.election3(n);
		}
		catch(TimeOutException e){
			e.printStackTrace();
		}
	}
}
