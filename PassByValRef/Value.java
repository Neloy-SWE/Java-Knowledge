package PassByValRef;

public class Value {
	
	/*java pointer concept support kore na.
	 * jodi korto tobe instance variable a ar method er vetor er 
	 * variable a sob eki hoto, fole valu pass kore a er man change kora 
	 * jeto.
	 */
int a= 10;
void change(int a){
	a=a+100;
	System.out.println("a in method : "+a);
}
public static void main(String[] args) {
	Value x= new Value();
	System.out.println("Before change a is : "+x.a);
	
	x.change(20);
	
	System.out.println("After change a is : "+x.a);
	
}
}
