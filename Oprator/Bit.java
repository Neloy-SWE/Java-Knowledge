package Oprator;
import java.util.*;
public class Bit {
public static void main(String[] args) {
	Scanner x = new Scanner(System.in);
	int a,b,c;
	a=x.nextInt();
	b=x.nextInt();
	
	c= a & b;
	System.out.println("Decimal form: "+c);
	System.out.println("Binary form: "+Integer.toBinaryString(c));
	c = a | b;
	System.out.println("Decimal form: "+c);
	System.out.println("Binary form: "+Integer.toBinaryString(c));
	c=a^b;
	System.out.println("Decimal form: "+c);
	System.out.println("Binary form: "+Integer.toBinaryString(c));
	c= ~(a^b);
	System.out.println("Decimal form: "+c);
	System.out.println("Binary form: "+Integer.toBinaryString(c));
	c= a>> 2;
	System.out.println("Decimal form: "+c);
	System.out.println("Binary form: "+Integer.toBinaryString(c));
	c= a<< 3;
	System.out.println("Decimal form: "+c);
	System.out.println("Binary form: "+Integer.toBinaryString(c));
	c= ~a;
	System.out.println("Decimal form: "+c);
	System.out.println("Binary form: "+Integer.toBinaryString(c));
	
}
}
