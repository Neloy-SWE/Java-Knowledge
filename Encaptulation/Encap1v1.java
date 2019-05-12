package Encaptulation;

public class Encap1v1 {
// data member gula ke private kore data hide kora hoi 
	
	private int a,b, c;
	// setter getter method gula ke public kora hoi jeno jekono jaga 
	// theke access newa jai
	
	// setter holo muloto write method 
	public void setINT(int a, int b, int c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	// getter holo read method 
	public int getINT(){
		return (a+ b +c);
	}
}
