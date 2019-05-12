package TypeCasting;

public class ObjToPri {
public static void main(String[] args) {
	String s1= "12";
	int i1= Integer.parseInt(s1);
	System.out.println(i1);
	
	// arekta method use kore oo string ke int te rupantor kora jai
	
	String s2= "45";
	int i2= Integer.valueOf(s2).intValue();
	System.out.println(i2);
	
	// eita temon use hoi na. Parse related method tai besi use hoi.
	
	String s3= "34.12";
	double d1= Double.parseDouble(s3);
	System.out.println(d1);
	
	String s4="Hello World";
	char ch;
	
	for (int i = 0; i < s4.length(); i++) {
		
		ch= (char) s4.charAt(i);
		System.out.println(ch);
	}
	
	//Long.parseLong
	//Short.parseShort
	//etc... ei rokom sob primitive er jonno class achhe.
	
	}
}
