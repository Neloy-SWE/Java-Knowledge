package Abstract;

public class rectangle extends figure{
	rectangle(double a, double b){
		super(a, b);
	}
	double calculation(){
		System.out.println("area of the rectangle : ");
		double c=x*y;
		return c;
	}

}
