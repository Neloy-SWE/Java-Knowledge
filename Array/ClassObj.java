//class object for array

package Array;

public class ClassObj {
public static void main(String[] args) {
	int [] a = new int [1];
	double [] b= new double [1];
	byte c[] = new byte[1]; 
    short d[] = new short[1]; 
    boolean [] e = new boolean [1];
    char [] f = new char [1];
    long [] g= new long [1];
    float [] h = new float [1];
    String [] i = new String[1];
    
    System.out.println("Integer");
	System.out.println(a.getClass());
	System.out.println(a.getClass().getSuperclass());
	System.out.println("Double");
	System.out.println(b.getClass());
	System.out.println(b.getClass().getSuperclass());
	System.out.println("Byte");
	System.out.println(c.getClass());
	System.out.println(c.getClass().getSuperclass());
	System.out.println("Short");
	System.out.println(d.getClass());
	System.out.println(d.getClass().getSuperclass());
	System.out.println("Boolean");
	System.out.println(e.getClass());
	System.out.println(e.getClass().getSuperclass());
	System.out.println("Char");
	System.out.println(f.getClass());
	System.out.println(f.getClass().getSuperclass());
	System.out.println("Long");
	System.out.println(g.getClass());
	System.out.println(g.getClass().getSuperclass());
	System.out.println("Float");
	System.out.println(h.getClass());
	System.out.println(h.getClass().getSuperclass());
	System.out.println("String");
	System.out.println(i.getClass());
	System.out.println(i.getClass().getSuperclass());
}
}
