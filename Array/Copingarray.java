// coping array to array

package Array;

public class Copingarray {
public static void main(String[] args) {
	int a []={10, 20 ,30, 40, 50};
	int b[]= new int [4];
	System.arraycopy(a,1,b,0,3);
	for (int i : b) {
		System.out.println(i);
	}
}
}
