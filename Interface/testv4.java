package Interface;

public class testv4 implements  Intf4v2,Intf4v1{
	
public void name(){
	System.out.println("commonly override");
}
public static void main(String[] args) {
	testv4 x = new testv4();
	x.name();
}
}
