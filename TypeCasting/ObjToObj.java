package TypeCasting;

class A {
public	String toString() {
		return "A";
	}
}

class B extends A {
public	String toString() {
		return "B";
	}
}

public class ObjToObj {
	public static void main(String[] args) {
		A x;
		B y = new B();
		System.out.println(y);
		x=y; 
		System.out.println(x);
		x=new A();
		System.out.println(x);
		if(x instanceof B){
			y=(B)x;
			System.out.println(y);
		}
	}
}
