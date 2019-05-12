package nestedclass;

public class member1v1 {
class inner {
	void test(){
		System.out.println("This is a inner class");
	}
}
void useinner(){
	member1v1.inner y = new member1v1.inner();
	y.test();
	/*eikhane inner y = new inner(); ei vabe o object create kora jeto 
	 * but jokhon ei class er vetor bairer onno kono class er nested class
	 * ke call dewar dorkar hobe tokhon er vabe class.nested_class object 
	 * create kore call dite hobe.
	 */
}

public static void main(String[] args) {
	
/*main method er vetor nested class er object create kora jachchhe na
 * ejonno outer class er vetor arekta method e nested class er object 
 * rekhe main method er vetor outer class er object create kore sei 
 * method ke call kore nested class er property ke use korte hobe
 */
	
	
	member1v1 x= new member1v1();
	x.useinner();
	
}
}
