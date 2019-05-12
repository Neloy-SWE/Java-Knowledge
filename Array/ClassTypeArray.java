package Array;
class array{
	int a;
	int b;
	array(int a, int b){
		this.a=a;
		this.b=b;
	}
	void print(){
		System.out.print(a);
		System.out.print(" "+b);
	}
}
public class ClassTypeArray {
public static void main(String[] args) {
	array [] a= new array[2];
	a[0]= new array(10, 20);
	a[1]= new array(30,40);
	
	a[0].print();
	System.out.println();
	a[1].print();
}
}
