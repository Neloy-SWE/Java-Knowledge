//general class 

package Inheritance;

public class SuperKey1v1 {
	int id;
int age;
String name;

 SuperKey1v1(String b, int a, int c ) {
	name=b;
	id=c;
	age=a;
	
}
// no argument constructor
SuperKey1v1(){
	name="Boss";
	id=182;
	age=21;
}

void details(){
	System.out.println("Name is:"+name);
	System.out.println("Name is:"+id);
	System.out.println("Age is: "+age);
	
}
}
