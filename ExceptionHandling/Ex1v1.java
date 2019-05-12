//use of try and catch keyword

package ExceptionHandling;

public class Ex1v1 {
public static void main(String[] args) {
	/*
	 * try block e sei line gula ke likha hoi jegula te exception hote 
	 * pare bole mone hoi
	 */
	try {
		int x = 0;
		int y= 10/x; //ArithmeticException
		int [] z = new int [4]; // ArrayIndexOutOfBoundsException
		System.out.println(z[100]);
	}
	
	
	/* try block e ekbar ekta exception peye gele ar nicher line gula kaj
	 * korbe na. jemon ekhane 2 ta exception thaka sorteo 1st exception 
	 * pawar por soja er exception er catch block e chole jabe. 
	 * ar jehetu nicher line kaj korbe na so porer exception er catch 
	 * block o kaj korbe na
	 * 
	 * 
	 * 
	 * catch block er parameter er jaigai related exception gula lekha 
	 * hoi. try block er jonno obossoy ekta catch block thaka lagbe
	 * tobe eker odhik o thakte pare. ar 1st catch block er parameter er
	 * exception kokhonoi nicher catch block er parameter er exception er 
	 * super class howa jabe na. jemon niche arithmetic er jaigai
	 * sudhu Exception mane super class thakle nicher ta ar kaj korto na
	 */
	
	
	catch(ArithmeticException a){
		System.out.println("Arithmetic exception");
	}
	catch (ArrayIndexOutOfBoundsException a){
		System.out.println("Array index out of bounds exception");
	}
System.out.println("Exception problem solved");
/*
 * jehetu exception handle hoye gechhe so nicher line ta ekhon print dibe
 * jeta exception thaka kalin kaj korto na.
 */
}
}
