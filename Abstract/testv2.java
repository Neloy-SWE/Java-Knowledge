package Abstract;

public class testv2 {
public static void main(String[] args) {
	Abs2v2 x = new Abs2v2();
	Abs2v3 y = new Abs2v3() {
		
		void c() {
			
		}

		void b() {
			
		}
	};
	
	x.a();
	x.b();
	x.c();
	y.a();
	
}
}
