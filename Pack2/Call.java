package Pack2;
import Pack1.*;
public class Call {
public static void main(String[] args) {
	PackCall1v1 x= new PackCall1v1();
	System.out.println(x.sum(10, 20));
	System.out.println(PackCall1v2.mul(10,20));
}
}
