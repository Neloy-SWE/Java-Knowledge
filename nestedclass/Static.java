package nestedclass;

public class Static {
// static nested class non static member ke use korte parbe na 
	static int a = 100, b= 200;
	static class sta{
		void nonstatic (){
			System.out.println("this is a non static method");
			System.out.println(a);
		}
		
		static void staticmethod(){
			System.out.println("this is a static method");
			System.out.println(b);
		}
	}
	void call (){
		sta x = new sta();
		x.nonstatic();
		sta.staticmethod();
	}
	/*public static void main(String[] args) {
		sta x = new sta();
		x.nonstatic();
		sta.staticmethod();
	}
	
	*static er khetre ei vabe static nested class er oo object main er
	*vetor kora jai jeta non static er khetre somvob na
	*
	*
	*/
}
/*
 * chaile import nestedclass.Static.sta; kore onno class e main method
 * er modhhe ei khan er main method er kaj ta kora jai.
 * 
 * abar call method er moto method er moddhe nested class er object create
 * kore oo nested class call kora jai 
 */
