package Array;

import java.util.Scanner;

public class Declaration {
public static void main(String[] args) {
	Scanner x = new Scanner(System.in);
	int [] a= new int[10];
	double [] b= new double[10];
	char[] c= new char [10];
	String [] s= new String[3];

	for (int i = 0; i < s.length; i++) {
		s[i]=x.nextLine();
	}
	/* ekhane space dile o ekta string count hobe na.
	 * enter chap dewar por tobei count hobe nextLine er jonno
	 */
	
	for (int i = 0; i < s.length; i++) {
		System.out.print(s[i]+" ");
	}
	for (int i = 0; i < s.length; i++) {
		s[i]=x.next();
	}
	// ekhane space dile ekta kore string count hobe.
	
	for (int i = 0; i < s.length; i++) {
		System.out.print(s[i]+" ");
	}
}
}
