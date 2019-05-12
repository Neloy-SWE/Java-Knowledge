
package Abstract;

public class testarea {
public static void main(String[] args) {
	triangle x = new triangle(12,20);
	rectangle y = new rectangle(12, 20);
	figure fig;
	fig=x;
	System.out.println(fig.calculation());
	fig=y;
	System.out.println(fig.calculation());
}
}
