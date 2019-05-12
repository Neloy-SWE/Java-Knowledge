package Interface;

public class testv3 implements Intf3v1, Intf3v2{
	public void name(){
		System.out.println("Boss");
	}
	 public void address(){
		System.out.println("Unknown");
	}
	public static void main(String[] args) {
		testv3 x = new testv3();
		x.name();
		x.address();
	}

}
