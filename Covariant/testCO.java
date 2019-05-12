package Covariant;

public class testCO {
public static void main(String[] args) {
	CO1v3 x = new CovariantReturn();
	System.out.println(x.xxx() instanceof CO1v2);
	System.out.println(x.xxx().a);
}
}

