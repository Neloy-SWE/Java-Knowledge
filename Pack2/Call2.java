package Pack2;
import Pack1.PackCall1v2;
import Pack1.PackCall1v1;
public class Call2 { 
	public static void main(String[] args) {
		int a= PackCall1v2.mul(10, 30);
		System.out.println(a);
		PackCall1v1 x = new PackCall1v1();
		int b= x.sum(20, 30);
		System.out.println(b);
	}

}
