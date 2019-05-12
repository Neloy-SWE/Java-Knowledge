package wrapper_class;

public class WrapperMethods {
	public static void main(String[] args) {

		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("100");
		Integer obj3 = new Integer(101);
		// we can print objects:

		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);

		// conpareTo method use kore 2 ta object er compare kora hoi.

		int a = obj1.compareTo(obj2);
		System.out.println(a);

		// kono variable er moddhe na rekhe sorasori print statement e o
		// method ta use kora jai.

		// ekta int ar arekta string holeo man 2 tar e same
		System.out.println(obj1.compareTo(obj2));

		// jodi 2 ta object er value same hoi tobe 0 print hobe
		// .(dot) er ager object boro hole 1 ar bracket er object boro hole
		// -1 print korbe

		System.out.println(obj1.compareTo(obj3));
		System.out.println(obj3.compareTo(obj1));

		/*
		 * .equals() method diye 2 ta object soman kina seta true and false
		 * orthat boolean man dara check kora hoi.
		 */

		System.out.println(obj1.equals(obj2));
		System.out.println(obj1.equals(obj3));

		System.out.println(Integer.compare(obj1, obj2));
		System.out.println(Integer.compare(obj1, obj3));

		// method gula onnanno wrapper class er jonno o bebohar kora jai
		// jemon Float, Double, Long etc...

		/*
		 * int ar float er joger jonno Value() method ta use kora jai. ei method
		 * ta float er jonno floatValue() hoto.
		 */
		Float f1 = new Float(20.00f);

		int b = f1.intValue() + obj2;
		System.out.println(b);

		// valueof method use kore decimal e convert kora hoi.
		// jemon string theke decimal e, binary theke decimal e etc...

		Integer obj4 = Integer.valueOf("12345");
		// base ullekh kore o dewa jabe
		Integer obj5 = Integer.valueOf("1010", 2);
		Integer obj6 = Integer.valueOf("D", 16);
		Integer obj7 = Integer.valueOf("101011", 10);

		System.out.println(obj4);
		System.out.println(obj5);
		System.out.println(obj6);
		System.out.println(obj7);
		/*
		 * obj7 print korbe 101011. mone hobe je man ta binary but base jehetu
		 * 10 tai 101011 ke decimal hisebei count kora hobe
		 */
		
		//method to convert hexadecimal
		System.out.println(Integer.toHexString(obj7));
		//method to convert binary
		System.out.println(Integer.toBinaryString(obj5));
		//method to convert octal
		System.out.println(Integer.toOctalString(obj5));
	}
}
