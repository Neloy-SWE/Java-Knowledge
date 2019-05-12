package Singleton;

public class Sing1v1 {
private static Sing1v1 x;
int a;
private Sing1v1 (int b){
	a=b;
}
public static Sing1v1 get(int h){
	
		x= new Sing1v1(h);
	return x;
}
public void display(){
	System.out.println("Output is: "+a);
}
}
