package String;

public class StringBuffer1v1 {
public static void main(String[] args) {
	/*
	 * string e concat method use kore 2 ta value jog kora hoi
	 * kintu seta sorasori somvob na. karon string opribortonsil
	 */
	String a= "Hello";
	a.concat(" World.");
	System.out.println(a);
	
	/*
	 * tobe jodi same object ba variable e man initialize kore dewa hoi
	 * tobe seta somvob
	 */
	
	String b= "Hello";
	b=b.concat(" World.");
	System.out.println(b);
	
	/*
	 * tobe ei kaj ta string buffer e sorasori kora somvob.
	 * string buffer e append method use kore 2 ta value add kora hoi
	 */
	
	StringBuffer x= new StringBuffer("Hello");
	x.append(" World.");
	System.out.println(x);
}
}
