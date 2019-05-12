package TypeCasting;

public class PriToPri {
public static void main(String[] args) {
	char c= 'A';
	int a=c;
	System.out.println(a);
	
	int d= 70;
	char e=(char)d;
	System.out.println(e);
	
	//widening
	
	int b1=10;
	double n1= b1;
	System.out.println(n1);
	
	//narrowing
	
	double n2=5.00;
	int b2=(int)n2;
	System.out.println(b2);
}
}
