package ExceptionHandling;

public class Throws {
static void election2(int a) throws ClassNotFoundException{
	if(a<18){
		throw new ClassNotFoundException("Not eligible for vote");
	}
	else {
		System.out.println("Eligible for vote");
	}
}
}
/*classnotfoundexception holo ekta checked exception ejonno throws 
*keyword use korte hoyechhe. tobe throws unchcked exception er jonno 
*ooo use kora jai 
*/