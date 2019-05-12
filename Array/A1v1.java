//use of .length method
// use of Arrays.sort method

package Array;

import java.util.Arrays;

public class A1v1 {
public static void main(String[] args) {
	int a[]={90, 80, 70, 60, 50, 40, 30, 20, 10};
	System.out.println("Before sort: ");
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]+ " ");
	}
	
	System.out.println("\n\n");
	Arrays.sort(a);
	System.out.println("After sort: ");
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]+ " ");
	}
}
}
