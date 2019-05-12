package Inheritance;

public class SuperKey1v3 extends SuperKey1v1 {
String address;
SuperKey1v3(String a){
	/* eikhane super(); method use korle o hoto na korle o hoto
	 * karon super class e no argument constructor ke use kora hoyechhe 
	 * jodi no argument constructor na thakto taile and kono constructor 
	 * na thakto tobe o kono problem hoto na. karon tokhon default
	 * constructor ke super(); method automatically call dito 
	 * but jodi kono constructor thakto tobe setar parameter er jonno
	 * obossoy super method use kora lagto. Karon ekta constructor declare
	 * kore dile default constructor ar kaj kore na.
	 */
	
	
	//super();
	
	address=a;
}

void print(){
	details();
	System.out.println("Address of the boss is: "+address);
}
}
