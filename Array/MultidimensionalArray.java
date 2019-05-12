package Array;

import java.util.Scanner;

public class MultidimensionalArray {
public static void main(String[] args) {
	Scanner x= new Scanner(System.in);
	
	// Jagged array declaration system: 
	// It's a kind of multidimensional array
	int a[][]=new int [3][];
	a[0]= new int [3];
	a[1]= new int [4];
	a[2]= new int [2];
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[i].length; j++) {
			a[i][j]=x.nextInt();
		}
	}
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[i].length; j++) {
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	
	System.out.println("\n");
	
	// multidimensional array declaration-1
	int [][] b= {{1, 2, 3}, {4, 5}, {1,2,3,4}};
	
	for (int i = 0; i < b.length; i++) {
		for (int j = 0; j < b[i].length; j++) {
			System.out.print(b[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println("\n");
	
	// multidimensional array declaration-2
int []c[] = {{100, 200, 300}, {400, 500}, {100,200,300,400}};
	
	for (int i = 0; i < c.length; i++) {
		for (int j = 0; j < c[i].length; j++) {
			System.out.print(c[i][j]+" ");
		}
		System.out.println();
	}
}
}
