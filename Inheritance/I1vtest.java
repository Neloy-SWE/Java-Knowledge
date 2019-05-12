package Inheritance;

public class I1vtest {
	public static void main(String[] args) {
		I1v1 x = new I1v1();
		I1v2 y = new I1v2();
		x.a=10;
		x.b=20;
		x.showab();
		y.a=100;
		y.b=200;
		y.c=300;
		y.showabc();
		y.sum();
	}
}
