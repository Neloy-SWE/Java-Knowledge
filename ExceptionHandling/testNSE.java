package ExceptionHandling;

import java.util.Scanner;

public class testNSE {
public static void main(String[] args) {
	Scanner x = new Scanner(System.in);
	int n= x.nextInt();
	try{
		useNSE.sound(n);
	}
	catch(NoSoundException e){
		e.printStackTrace();
	}
}
}
