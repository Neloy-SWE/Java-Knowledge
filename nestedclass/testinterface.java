package nestedclass;
/*
 * ei khane jodi outer class ke implements kori tahole sudhu outer class
 * er method ke override korbe. ar inner class er method ke implements 
 * korle sudhu inner class er method ke override korbe.
 * abar chaile eki sathe outer inner 2 ta kei implements kora jabe
 */

//public class testinterface implements Interface, Interface.interinner
// erokom korle 2 ta method ee use kora jabe

public class testinterface implements Interface.interinner {
	@Override
	public void inner() {
		System.out.println("this is inner method");
	}
public static void main(String[] args) {
Interface.interinner x = new testinterface();
x.inner();
}

}
