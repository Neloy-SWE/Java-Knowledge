// class for student

package Inheritance;

public class SuperKey1v2 extends SuperKey1v1{
String position;
	String department;
	public SuperKey1v2(String e ,int c, int d, String a, String b) {
		super(e, c, d);// use of super keyword
		//obossoy super method constructor e sobar age use korte hobe
		//super er age kono kichhu initialize kora jabe na 
		position=a;
		department=b;
	}
	void det(){
		details();
		System.out.println("Position is: "+position);
		System.out.println("Name of the department is: "+department);
	}
}
