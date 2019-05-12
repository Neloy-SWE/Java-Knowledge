package Array;

public class PassTomethod {
	static void Sum( int[] a){
	int sum=0;
	for (int i : a) {
		sum=sum+i;
	}
	System.out.println("Sum is: "+sum);
}
public static void main(String[] args) {
	int a[]={10, 20, 30};
	Sum(a);
}
}
