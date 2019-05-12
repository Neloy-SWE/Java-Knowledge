package Inheritance;

public class SuperKeytest {
public static void main(String[] args) {
	SuperKey1v2 x=new SuperKey1v2("Neloy", 181, 20, "Student", "SWE");
	x.det();
	
	SuperKey1v3 y= new SuperKey1v3("Dhaka");
	System.out.println("\n");
	y.print();
	
	SuperKey1v1 z= new SuperKey1v1();
	z.details();
	
	Overriding t= new Overriding();
	t.details();
}
}
