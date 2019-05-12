package ExceptionHandling;

public class printException {
public static void main(String[] args) {
	try {
		int x = 0;
		int y= 10/x;
	}
	catch(ArithmeticException a){
		System.out.println("Exception is: "+a);
	}
	try {
		int [] z = new int [4]; 
		System.out.println(z[5]);
	}
	catch (ArrayIndexOutOfBoundsException a){
		System.err.println("Exception is: "+a);
	}
	try{
		String s= "12a";
		int h = Integer.parseInt(s);
	}
	catch(NumberFormatException a){
		a.printStackTrace();
	}
}
}

/*
 *exception chaile 3 vabe print korte parbo
 * catch block e exception er sathe jei variable dewa achhe seta muloto
 * ekta object er reference 
 * 1. oi object ke System.out.println("Exception is: "+a); ei vabe 
 * print kora jabe
 * 2. System.err.println("Exception is: "+a); ei vabe print kora jabe
 * 3. a.printStackTrace(); ei method er maddhome print kora jabe
 * method diye print korle exception somporke aro details print hobe
 * jemon kon line exception kon jaigai exception etc...
 */
