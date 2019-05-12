//cloning of array

package Array;

public class Cloning {
public static void main(String[] args) {
	int a[]={10, 20, 30};
	int clone1[]= a.clone();
	for (int i : clone1) {
		System.out.println(i);
	}
	int [][]b= {{1,2,3},{4,5,6}};
	int[][] clone2= b.clone();
	for (int i =0; i<clone2.length; i++) {
		for (int j =0; j<clone2[i].length; j++) {
			System.out.print(clone2[i][j]+ " ");
		}
		System.out.println();
	}
	
}
}
