// Anonymous Array

package Array;

public class Anonymous {
static int array(int a[]){
	int sum= 0;
	for (int i : a) {
		sum= sum+i;
	}
	return sum;
}
public static void main(String[] args) {
	System.out.println(array(new int[]{1,2,3}));
	
	// there has no declaration of array. 
	
}
}
