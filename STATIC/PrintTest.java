package STATIC;

public class PrintTest {
 static {
	 System.out.println("1st block");
 }
 static void name(){
	System.out.println("1st method"); 
 }

 public static void main(String[] args) {
	System.out.println("Main method");
	name();
}
 static {
	 System.out.println("2nd block");
 }
}
