package Interface;

public class Intf1v2 implements Intf1v1 {
	
	/*
	 * amra jani je class er method gula by default default obosthai 
	 * thake. but interface er method by default public obosthai thake 
	 * ejonno class e override korar somoy obossoy medthod er modifier 
	 * public kore dite hobe
	 */

	@Override
	public void name() {
		System.out.println("Neloy");
		
	}

	@Override
	public void address() {
		System.out.println("Rajshahi");
	}
	public static void main(String[] args) {
		Intf1v2 x = new Intf1v2();
		x.name();
		x.address();
	}

}
