package String;

public class String1V1 {
	public static void main(String[] args) {
		// string literal:
		String a = "Welcome";
		System.out.println("(Printing a) " + a);

		// using new keyword:
		String b = new String("Welcome");
		System.out.println("(Printing b) " + b);

		/*
		 * jokhon new kiteral and new key word dara toiri string createkorbo
		 * tokhon value same holeo vinno object refer korbe
		 */

		if (a == b) {
			System.out.println("a and b refer same object");
		} else {
			System.out.println("a and b refer different objects");
		}

		if (a.equals(b)) {
			System.out.println("a and b have same value");
		} else {
			System.out.println("a and b are not same");
		}

		/*
		 * Sring er man eki hole 2 ta variable eee eki object ke referkorbe
		 */

		String c1 = "Welcome";
		if (a == c1) {
			System.out.println("a and c1 refer same object");
		} else {
			System.out.println("a and c1 refer different objects");
		}
		if (a.equals(c1)) {
			System.out.println("a and c1 have same value");
		} else {
			System.out.println("a and c1 are not same");
		}
		/*
		 * 2 ta string ke jog korle o man jodi ek hoi tobe eki object refer
		 * korbe
		 */

		String c2 = "Wel";
		String c3 = "Wel" + "come";
		if (a == c3) {
			System.out.println("a and c3 refer same object");
		} else {
			System.out.println("a and c3 refer different objects");
		}
		if (a.equals(c3)) {
			System.out.println("a and c3 have same value");
		} else {
			System.out.println("a and c3 are not same");
		}

		/*
		 * ek ta string er sathe jodi variable jog kore string complete kora hoi
		 * tobe man ek hole ooo alada object ke refer korbe
		 */

		String c4 = c2 + "come";
		System.out.println("(Printing c4) " + c4);

		if (a == c4) {
			System.out.println("a and c4 refer same object");
		} else {
			System.out.println("a and c4 refer different objects");
		}
		if (a.equals(c4)) {
			System.out.println("a and c4 have same value");
		} else {
			System.out.println("a and c4 are not same");
		}

		String s1 = new String("Hello");
		String s2 = new String("Hello");

		// 2 ta vinno object. but same value

		if (s1 == s2) {
			System.out.println("s1 and s2 refer same object");
		} else {
			System.out.println("s1 and s2 refer different objects");
		}
		if (s1.equals(s2)) {
			System.out.println("s1 and s2 have same value");
		} else {
			System.out.println("s1 and s2 are not same");
		}
		s1 = s2;
		if (s1 == s2) {
			System.out.println("s1 and s2 refer same object");
		} else {
			System.out.println("s1 and s2 refer different objects");
		}
		if (s1.equals(s2)) {
			System.out.println("s1 and s2 have same value");
		} else {
			System.out.println("s1 and s2 are not same");
		}

		/*
		 * jodi object 2 ta ke equal kore dewa hoi tobe man vinno assign kora
		 * thakleo same objcet refer and same man dekhabe
		 */

		String s3 = new String("Hello");
		String s4 = new String("World");
		s3 = s4;
		if (s3 == s4) {
			System.out.println("s3 and s4 refer same object");
		} else {
			System.out.println("s3 and s4 refer different objects");
		}
		if (s3.equals(s4)) {
			System.out.println("s3 and s4 have same value");
		} else {
			System.out.println("s3 and s4 are not same");
		}

	}
}
