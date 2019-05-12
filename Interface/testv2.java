package Interface;

public class testv2 implements Intf2v2 {
public void address(){
	System.out.println("London");
}
public void name(){
	System.out.println("Neel");
}
public static void main(String[] args) {
	testv2 x= new testv2();
	x.name();
	x.address();
}
}

