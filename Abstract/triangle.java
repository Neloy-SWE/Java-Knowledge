package Abstract;

public class triangle extends figure{
	triangle (double a, double b){
		super(a, b);
	}
	
double calculation (){
	System.out.println("area of the triangle is : ");
	double c= x*y/2;
	return c;
}
}
