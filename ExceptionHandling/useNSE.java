package ExceptionHandling;

public class useNSE {
static void sound(int a){
	if(a<20){
		throw new NoSoundException("Cannot listen");
	}
	else {
		System.out.println("Can listen");
	}
}
}
