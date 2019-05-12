package ExceptionHandling;

public class Throw {
static void election(int a){
	if(a<18){
		throw new ArithmeticException("Not eligible for vote");
	}
	else {
		System.out.println("Eligible for vote");
	}
}
}
/*
 * throw er kaj ta holo caller er kachhe ekta exception er object ke 
 * throw kore dewa. jemon ei khane not eligible for vote holo 
 * arithmetic exception er ekta object ja ei method ke jekhan theke 
 * call dewa hoyechhe sekhane throw hobe. 
 */

