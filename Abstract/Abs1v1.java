package Abstract;

public abstract class Abs1v1 {
	abstract void a();
	int sum (int a){
		System.out.println("this method is belongs to abstract class");
		int x = 100+a;
		return x;
	}
}

class Abs1v2 extends Abs1v1{
	void a(){
		System.out.println("abstract method overriden");
	}
}




